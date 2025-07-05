import logging
from antlr4 import FileStream
from antlr4.tree import Tree

from runtime.SugarcLexer import SugarcLexer
from runtime.SugarcParser import SugarcParser, ErrorNode
from src.compiler.metadata import (
    CompilerMetadata,
    ClassMetadata,
    FunctionMetadata,
    MethodMetadata,
    VariableMetadata,
)
from src.contraints import get_template_paths
from src.erros import SugarcSyntaxError


def get_parents(ctx, *parents: tuple[type]):

    out = []
    for t in parents:
        parent = ctx.parentCtx
        while parent:
            if isinstance(parent, t):
                out.append(parent)

            parent = parent.parentCtx

    return tuple(out)


class SugarcCodeGenerator:

    @classmethod
    def _ignore(cls, _):
        return ""

    @classmethod
    def syntax_error(cls, ctx: ErrorNode, msg=""):
        lexer: SugarcLexer = ctx.symbol.source[0]
        file: FileStream = ctx.symbol.source[1]
        start, stop = ctx.symbol.start, ctx.symbol.stop

        while code_snippet := file.getText(start, stop):
            if code_snippet[0] != "\n":
                start -= 1
            if code_snippet[-1] != "\n":
                stop += 1

            if code_snippet[0] == "\n" and code_snippet[-1] == "\n":
                break

            raise SugarcSyntaxError(
                f"Syntax error at line {ctx.symbol.line}, column {ctx.symbol.column}: {code_snippet if not msg else msg}"
            )
        return ""

    @classmethod
    def gen_program(cls, ctx: SugarcParser.ProgramContext):
        yield "#include <stdio.h>\n#include <stdlib.h>\n#include <stdbool.h>\n"

        for node in ctx.children:
            if isinstance(node, ErrorNode):
                yield cls.syntax_error(node)

            match type(node):
                case SugarcParser.ClassDeclContext:

                    yield cls.gen_class_decl(node)
                case SugarcParser.FunctionDeclContext:
                    yield cls.gen_function_decl(node)
                case (
                    SugarcParser.VarDeclContext
                    | SugarcParser.VariableDeclarationContext
                ):
                    yield cls.gen_var_decl(node) + ";"
                case Tree.TerminalNodeImpl:
                    if str.startswith(node.getText(), "#"):
                        # Preprocessor directive
                        logging.warning(f"Preprocessor directive: {node.getText()}")
                        yield node.getText()
                case _:
                    logging.debug("Skipping node: %s %s", node.getText(), type(node))
                    yield ""

    @classmethod
    def gen_function_decl(cls, ctx: SugarcParser.FunctionDeclContext):
        if not ctx.type_():
            SugarcSyntaxError("Function declaration without return type")

        func_name = ctx.ID().getText()
        func_type = cls.gen_type(ctx.type_())
        metadata = FunctionMetadata(name=func_name, return_type=func_type)

        if params := ctx.params() and (params := params.param()):
            for param in params:
                param_type = cls.gen_type(param.getChild(0))
                param_name = ctx.getChild(1).getText()
                metadata.params[param_name] = VariableMetadata(
                    var_type=param_type,
                    name=param_name,
                    is_object=("-".join(param_name.split("_")[::-1][1:][::-1])),
                )

        CompilerMetadata.functions[func_name] = metadata

        func_params = cls.gen_params(ctx.params())
        func_block = cls.gen_block(ctx.block())

        return f"{func_type} {func_name}({func_params}) {func_block}"

    @classmethod
    def gen_var_decl(cls, ctx: SugarcParser.VarDeclContext) -> str:
        if not ctx:
            return ""
        var_type = cls.gen_type(ctx.type_())
        var_name = ctx.ID().getText()

        if isinstance(ctx.parentCtx, SugarcParser.ProgramContext):
            CompilerMetadata.global_vars[var_name] = VariableMetadata(
                var_type=var_type, name=var_name, is_object=False
            )

        if method_metadata := CompilerMetadata.get_method_metadata(ctx)[1]:
            method_metadata.variables[var_name] = VariableMetadata(
                var_type=var_type,
                name=var_name,
                is_object=(
                    ctx.type_().getChild(0).getText()
                    in CompilerMetadata.classes_metadata
                ),
            )

        if isinstance(ctx, SugarcParser.ArrayDeclarationContext):
            return f"{var_type} {var_name}[{ctx.INT() or ''}]"

        return f"{var_type} {var_name} { '= ' + cls.gen_expr(ctx.expr()) if ctx.expr() else ''}"

        match type(ctx):
            case SugarcParser.VariableDeclarationContext:
                _ctx: SugarcParser.VariableDeclarationContext = ctx
                if not _ctx.expr():
                    return f"{var_type} {var_name};"

                var_value = cls.gen_expr(_ctx.expr())
                return f"{var_type} {var_name} = {var_value};"
            case SugarcParser.ArrayDeclarationContext:
                array_type = cls.gen_type(ctx.type_())
                array_name = ctx.ID().getText()
                array_size = ctx.INT().getText() if ctx.INT() else ""

                return f"{array_type} {array_name}[{array_size}]"

    @classmethod
    def gen_class_constructor(
        cls, ctx: SugarcParser.ClassContructorDeclContext, class_metadata: ClassMetadata
    ):
        _, template_path = get_template_paths("classContructorDecl")
        metadata = class_metadata.constructor
        metadata.name = f"{class_metadata.type_name}_constructor"
        metadata.return_type = f"{class_metadata.type_name}*"
        if not ctx:
            return open(template_path).read() % {
                "block": "",
                "name": class_metadata.type_name,
                **class_metadata.constructor.model_dump(
                    include=["return_type", "params"]
                ),
            }

        metadata.is_automated = False

        if isinstance(params := ctx.params(), SugarcParser.ParamsContext):
            for param in params.getTypedRuleContexts(SugarcParser.ParamContext):
                metadata.params.append(cls.gen_param(param))

        return open(template_path).read() % {
            "block": cls.gen_block(ctx.block()),
            "name": class_metadata.type_name,
            **class_metadata.constructor.model_dump(include=["return_type", "params"]),
        }

    @classmethod
    def gen_class_decl(cls, ctx: SugarcParser.ClassDeclContext):
        metadata = CompilerMetadata.create_class_metadata(ctx)
        constructor_implementation = cls.gen_class_constructor(
            ctx.classContructorDecl(0), metadata
        )
        methods_implementation = "\n\n".join(
            map(
                lambda child: cls.gen_method(child, metadata),
                ctx.getTypedRuleContexts(SugarcParser.MethodDeclContext),
            ),
        )

        class_attributes = ";\n".join(
            filter(
                bool,
                map(
                    lambda child: cls.gen_attr(child, metadata),
                    ctx.getTypedRuleContexts(SugarcParser.ClassAttrDeclContext),
                ),
            )
        )

        _, source_template = get_template_paths("classDecl")
        return open(source_template).read() % {
            "constructor": constructor_implementation,
            "methods": methods_implementation,
            "attributes": (class_attributes + ";" if class_attributes else ""),
            **metadata.model_dump(include=["type_name", "inherence"]),
        }

    @classmethod
    def gen_type(cls, ctx: SugarcParser.TypeContext):
        if not ctx:
            return ""

        match type(ctx):
            case SugarcParser.PrimitiveTypeContext:
                return " ".join(child.getText() for child in ctx.children)
            case SugarcParser.DeviatedTypeContext:
                type_name = ctx.getChild(0).getText()
                if type_name in CompilerMetadata.defined_types:
                    return type_name

                if class_metadata := CompilerMetadata.get_class_metadata_by_name(
                    type_name
                ):
                    return f"{class_metadata.type_name}*"
            case _:
                raise SugarcSyntaxError("Invalid type: '%s'", ctx.getText())

    @classmethod
    def gen_attr(
        cls, ctx: SugarcParser.ClassAttrDeclContext, class_metadata: ClassMetadata
    ) -> str:
        attr_type = cls.gen_type(ctx.getChild(0))
        attr_name = ctx.ID().getText()
        class_metadata.attributes[attr_name] = attr_type

        if isinstance(ctx, SugarcParser.ArrayAttributeDeclarationContext):
            return f"{attr_type} {attr_name}[{ctx.size or ''}]"

        return f"{attr_type} {attr_name}"

    @classmethod
    def gen_method(
        cls, ctx: SugarcParser.MethodDeclContext, class_metadata: ClassMetadata
    ) -> str:
        return_type = cls.gen_type(ctx.type_())
        method_name = f"{class_metadata.type_name}_{ctx.getChild(1).getText()}"

        method_params = [f"{class_metadata.type_name}* this"]

        if isinstance(params := ctx.params(), SugarcParser.ParamsContext):
            for param in params.getTypedRuleContexts(SugarcParser.ParamContext):
                method_params.append(cls.gen_param(param))

        metadata = MethodMetadata(
            name=method_name,
            return_type=return_type,
            params=method_params,
        )
        class_metadata.methods[ctx.getChild(1).getText()] = metadata

        method_block = ctx.block() and cls.gen_block(ctx.block()) or ""

        return f"{metadata} {method_block}"

    @classmethod
    def gen_param(cls, ctx: SugarcParser.ParamsContext):
        param_type = cls.gen_type(ctx.getChild(0))
        param_name = ctx.getChild(1).getText()

        return f"{param_type} {param_name}"

    @classmethod
    def gen_params(cls, ctx: SugarcParser.ParamsContext):
        if ctx:
            params = ctx.getTypedRuleContexts(SugarcParser.ParamContext)
            return str.join(",", map(cls.gen_param, params))
        else:
            return ""

    @classmethod
    def gen_block(cls, ctx: SugarcParser.BlockContext):
        if not ctx:
            return ""

        stmts = ctx.getTypedRuleContexts(SugarcParser.StmtContext)
        content = str.join(
            "\n",
            (
                f"{stmt}{'' if str.endswith(stmt, ';') or str.endswith(stmt, '}') else ';'}"
                for stmt in map(str.strip, (filter(bool, map(cls.gen_stmt, stmts))))
            ),
        )
        return f"{{\n{content}{'' if content.endswith(';') or content.endswith('}') else ';'}\n}}"

    @classmethod
    def gen_expr(cls, ctx: SugarcParser.ExprContext):
        if not ctx:
            return ""
        match type(ctx):
            case SugarcParser.NotExprContext:
                return f"!{cls.gen_expr(ctx.expr())}"
            case SugarcParser.ObjectInstantiationContext:
                class_name = ctx.getChild(1).getText()
                class_metadata = CompilerMetadata.get_class_metadata_by_name(class_name)
                constructor_params = cls.gen_expr_list(ctx.exprList())

                return f"{class_metadata.constructor.name}({constructor_params})"
            case SugarcParser.FunctionCallContext:
                function_name = ctx.getChild(0).getText()
                # if function_name not in CompilerMetadata.functions:
                #     raise SugarcSyntaxError(
                #         "function '%s' not define" % (function_name)
                #     )
                function_params = cls.gen_expr_list(
                    SugarcParser.FunctionCallContext.exprList(ctx)
                )
                return f"{function_name}({function_params})"
            case (
                SugarcParser.MulDivExprContext
                | SugarcParser.AddSubExprContext
                | SugarcParser.RelationalExprContext
                | SugarcParser.EqualityExprContext
                | SugarcParser.AndExprContext
                | SugarcParser.OrExprContext
                | SugarcParser.SelfAssignmentContext
                | SugarcParser.ShiftExprContext
            ):
                left_exp = cls.gen_expr(ctx.getChild(0))
                operator = ctx.getChild(1).getText()
                right_exp = cls.gen_expr(ctx.getChild(2))

                return f"{left_exp} {operator} {right_exp}"
            case SugarcParser.StepSelfAssignmentContext:
                exp = cls.gen_expr(ctx.getChild(0))
                op = ctx.getChild(1).getText()
                return exp + op

            case SugarcParser.TypeCastContext:
                cast_type = cls.gen_type(ctx.type_())
                expr = cls.gen_expr(ctx.expr())
                return f"({cast_type}) {expr}"

            case SugarcParser.SelfReferenceContext:

                if not (class_metadata := CompilerMetadata.get_class_metadata(ctx)):
                    raise SugarcSyntaxError(
                        "Syntax error: 'this' reference can only be used inside methods. '%s'"
                        % (ctx.getText())
                    )

                if not (expr := ctx.expr()):
                    raise SugarcSyntaxError(
                        "Syntax error: incomplete expression '%s'" % (ctx.getText())
                    )

                if isinstance(expr, SugarcParser.MethodCallContext):
                    return cls.gen_expr(ctx.expr())

                if isinstance(
                    expr,
                    (
                        SugarcParser.VarReferenceContext,
                        SugarcParser.AssignmentContext,
                        SugarcParser.ArrayAccessContext,
                        SugarcParser.IndexAssignmentContext,
                    ),
                ):

                    check_list = class_metadata.attributes

                    is_invalid = (
                        not (var := expr.ID()) or var.getText() not in check_list
                    )
                    scount = 0
                    while is_invalid and (metadata := class_metadata.inherence):
                        is_invalid = (
                            not (var := expr.ID())
                            or var.getText() not in metadata.attributes
                        )
                        scount += 1
                else:
                    is_invalid = True

                if is_invalid:
                    class_type = "_".join(
                        class_metadata.type_name.split("_")[::-1][1:][::-1]
                    )
                    raise SugarcSyntaxError(
                        "error: class '%s' has no member called '%s'"
                        % (class_type, expr.getText())
                    )

                return f"this->{'super->' * scount}{cls.gen_expr(ctx.expr())}"

            case SugarcParser.MethodCallContext:
                is_var = isinstance(ctx.expr(), SugarcParser.VarReferenceContext)
                # return "xxxxxxxxx"
                if is_var:
                    var_metadata = CompilerMetadata.get_var_metadata(ctx.expr())

                    var_type = "_".join(
                        var_metadata.var_type.split("_")[::-1][1:][::-1]
                    )
                    if class_metadata := CompilerMetadata.get_class_metadata_by_name(
                        var_type
                    ):
                        method_name = ctx.ID().getText()
                        if method_name not in class_metadata.methods:
                            raise SugarcSyntaxError(
                                "error: '%s' don't have method called '%s' "
                                % (var_metadata.var_type, method_name)
                            )

                        params = cls.gen_expr_list(ctx.exprList())
                        return f"{class_metadata.methods[method_name].name}({cls.gen_expr(ctx.expr())}{', ' if params else ''}{params})"

            case SugarcParser.MemberAccessContext:

                is_var = isinstance(
                    expr := ctx.expr(), SugarcParser.VarReferenceContext
                )
                var_name = expr.getChild(0).getText()

                parent = ctx.parentCtx
                while parent:
                    if is_var:
                        if isinstance(parent, SugarcParser.MethodDeclContext):
                            class_metadata, method_metadata = (
                                CompilerMetadata.get_method_metadata(parent)
                            )

                            if (
                                var_name not in method_metadata.variables
                                or not method_metadata.variables[var_name].is_object
                            ):

                                raise SugarcSyntaxError(
                                    f"Syntax error: '%s' don't have member called '%s'."
                                    % (
                                        parent.parentCtx.getChild(1).getText(),
                                        var_name,
                                    )
                                )

                            return f"{cls.gen_expr()}->{ctx.ID().getText()}"

                        elif isinstance(
                            parent, SugarcParser.ClassContructorDeclContext
                        ):
                            class_name = parent.parentCtx.getChild(1).getText()
                            class_metadata = (
                                CompilerMetadata.get_class_metadata_by_name(class_name)
                            )

                            if not (
                                class_metadata.constructor.variables[var_name].is_object
                            ):
                                raise SugarcSyntaxError()
                        else:
                            return f"{cls.gen_expr(expr)}->{ctx.ID().getText()}"

                    elif isinstance(parent, SugarcParser.ObjectInstantiationContext):
                        class_name = parent.getChild(1).getText()
                        if (
                            name := ctx.ID().getText
                        ) in CompilerMetadata.get_class_metadata_by_name(
                            class_name
                        ).attributes:
                            return f"{cls.gen_expr(ctx.expr())}->{name}"

                    parent = parent.parentCtx

            case SugarcParser.AssignmentContext:
                var = ctx.ID().getText()
                expr = cls.gen_expr(ctx.expr())

                return f"{var} = {expr}"

            case SugarcParser.GroupedExprContext:
                return f"({cls.gen_expr(ctx.expr())})"

            case SugarcParser.IndexAssignmentContext:
                array = ctx.ID().getText()
                index = cls.gen_expr(ctx.expr(0))
                expr = cls.gen_expr(ctx.expr(1))

                return f"{array}[{index}] = {expr}"

            case SugarcParser.SelfMethodCallContext:

                if class_metadata := CompilerMetadata.get_class_metadata(ctx):
                    method_name = ctx.ID().getText()
                    if method_name not in class_metadata.methods:
                        raise SugarcSyntaxError(
                            "error: '%s' don't have method called '%s' "
                            % (class_metadata.name, method_name)
                        )

                    params = cls.gen_expr_list(ctx.exprList())
                    return f"{class_metadata.methods[method_name].name}(this{', ' if params else ''}{params})"

            case SugarcParser.ArrayAccessContext:
                return (
                    f"{cls.gen_expr(ctx.getChild(0))}[{cls.gen_expr(ctx.getChild(2))}]"
                )

            case SugarcParser.VarReferenceContext:
                return ctx.getText()

            case SugarcParser.LiteralExprContext:
                return ctx.getText()

            case _:
                raise SugarcSyntaxError(f"Invalid expression: '{ctx.getText()}'")

    @classmethod
    def gen_expr_list(cls, ctx: SugarcParser.ExprListContext):
        if not ctx:
            return ""

        return str.join(
            ",",
            map(
                cls.gen_expr,
                ctx.getTypedRuleContexts(SugarcParser.ExprContext),
            ),
        )

    @classmethod
    def gen_stmt(cls, ctx: SugarcParser.StmtContext) -> str:
        if not ctx:
            return ""
        if ctx.expr():
            return cls.gen_expr(ctx.expr())
        if ctx.controlStmt():
            return cls.gen_control_stmt(ctx.controlStmt())
        if ctx.block():
            return cls.gen_block(ctx.block())
        if isinstance(ctx, ErrorNode):
            return cls.syntax_error(ctx)

        if isinstance(var_decl := ctx.varDecl(), SugarcParser.VarDeclContext):
            return cls.gen_var_decl(var_decl)

        if isinstance(if_stmt := ctx.ifStmt(), SugarcParser.IfStmtContext):
            if_action = cls.gen_stmt(if_stmt.stmt())
            condition = cls.gen_expr(if_stmt.expr())
            else_action = (
                f"else {cls.gen_stmt(if_stmt.elseStmt())}" if if_stmt.elseStmt() else ""
            )
            return f"if ({condition}) {if_action} {else_action}"
        if isinstance(for_stmt := ctx.forStmt(), SugarcParser.ForStmtContext):
            init_stmt = cls.gen_var_decl(for_stmt.varDecl())
            condition_expr = cls.gen_expr(for_stmt.expr(0))
            update_expr = cls.gen_expr(for_stmt.expr(1))
            body_block = cls.gen_stmt(for_stmt.stmt())

            return f"for ({init_stmt}; {condition_expr}; {update_expr}) {body_block}"
        if isinstance(while_stmt := ctx.whileStmt(), SugarcParser.WhileStmtContext):
            condition = cls.gen_expr(while_stmt.expr())
            body_block = cls.gen_stmt(while_stmt.stmt())
            return f"while ({condition}) {body_block}"

        return f"{type(ctx)} not implemented"

    @classmethod
    def gen_control_stmt(cls, ctx: SugarcParser.ControlStmtContext):
        match type(ctx):
            case SugarcParser.BreakStmtContext:
                return ctx.getText()
            case SugarcParser.ContinueStmtContext:
                return ctx.getText()
            case SugarcParser.ReturnStmtContext:
                if return_val := SugarcParser.ReturnStmtContext.expr(ctx):
                    return f"return {cls.gen_expr(return_val)};"
                return "return;"
            case _:
                raise SugarcSyntaxError("Unknown command: %s", ctx.getText())
