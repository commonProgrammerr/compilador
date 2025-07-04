import logging
from antlr4 import FileStream
from antlr4.tree import Tree
from sys import stderr

from runtime.SugarcLexer import SugarcLexer
from runtime.SugarcParser import SugarcParser, ErrorNode
from src.compiler.metadata import CompilerMetadata, ClassMetadata, MethodMetadata
from src.contraints import get_template_paths
from src.erros import SugarcSyntaxError


class SugarcCodeGenerator:

    @classmethod
    def _ignore(cls, _):
        return ""

    @classmethod
    def sintax_error(cls, ctx: ErrorNode):
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
            f"Syntax error at line {ctx.symbol.line}, column {ctx.symbol.column}: {code_snippet}"
        )
        return ""

    @classmethod
    def gen_program(cls, ctx: SugarcParser.ProgramContext):
        SugarcParser.addErrorListener
        for node in ctx.children:

            if isinstance(node, ErrorNode):
                yield cls.sintax_error(node)

            match type(node):
                case SugarcParser.ClassDeclContext:

                    yield cls.gen_class_decl(node)
                case SugarcParser.FunctionDeclContext:
                    yield cls.gen_function_decl(node)
                case SugarcParser.VarDeclContext:
                    yield cls.gen_var_decl(node)
                case Tree.TerminalNodeImpl:
                    if str.startswith(node.getText(), "#"):
                        # Preprocessor directive
                        logging.warning(f"Preprocessor directive: {node.getText()}")
                        yield node.getText()
                case _:
                    logging.debug(f"Skipping node: {node.getText()}", type(node))
                    yield ""

    @classmethod
    def gen_function_decl(cls, ctx: SugarcParser.FunctionDeclContext):
        if not ctx.type_():
            SugarcSyntaxError("Function declaration without return type")

        func_type = cls.gen_type(ctx.type_())
        func_name = ctx.ID().getText()
        func_params = cls.gen_params(ctx.params())
        func_block = cls.gen_block(ctx.block())

        return f"{func_type} {func_name}({func_params}) {func_block}"

    @classmethod
    def gen_var_decl(cls, ctx: SugarcParser.VarDeclContext) -> str:
        if not ctx:
            return ""
        var_type = cls.gen_type(ctx.type_())
        var_name = ctx.ID().getText()

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
                array_size = ctx.size

                return f"{array_type} {array_name}[{array_size}]"

    @classmethod
    def gen_class_constructor(cls, class_metadata: ClassMetadata):
        alloc_object = f"{class_metadata.name}* this = ({class_metadata.name}*)  malloc(sizeof({class_metadata.name}));"
        assign_attr = "".join(
            f"this->{attr} = {attr};" for attr in class_metadata.attributes.keys()
        )

        class_constructor_block = f"{{{alloc_object}{assign_attr} return this;}}"
        constructor_params = ",".join(
            f"{type} {name}" for name, type in class_metadata.attributes.items()
        )
        constructor_head = (
            f"{class_metadata.name}* {class_metadata.constructor}({constructor_params})"
        )

        return f"{class_metadata.constructor}{class_constructor_block}"

    @classmethod
    def gen_class_decl(cls, ctx: SugarcParser.ClassDeclContext):
        metadata = CompilerMetadata.create_class_metadata(ctx)
        constructor_implementation = cls.gen_class_constructor(metadata)
        methods_implementation = str.join(
            "\n",
            map(
                lambda child: cls.gen_method(child, metadata),
                ctx.getTypedRuleContexts(SugarcParser.MethodDeclContext),
            ),
        )

        class_attributes = ";".join(
            map(
                lambda child: cls.gen_attr(child, metadata),
                ctx.getTypedRuleContexts(SugarcParser.ClassAttrDeclContext),
            )
        )

        header_template, sourcer_template = get_template_paths("classDecl")

        return str.join(
            "\n",
            (
                open(header_template).read()
                % metadata.model_dump(
                    include=[
                        "name",
                        "inherence",
                        "constructor",
                        "methods",
                        "attributes",
                    ],
                ),
                "open(sourcer_template).read() % {}",
            ),
        )

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

                if class_metadata := CompilerMetadata.get_class_metadata(type_name):
                    return f"{class_metadata.name}*"
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
            return f"{attr_type} {attr_name}[{ctx.size}]"

        return f"{attr_type} {attr_name}"

    @classmethod
    def gen_method(
        cls, ctx: SugarcParser.MethodDeclContext, class_metadata: ClassMetadata
    ) -> str:
        return_type = cls.gen_type(ctx.type_())
        method_name = f"{class_metadata.name}_{ctx.getChild(1).getText()}"
        method_params = list(
            filter(
                bool,
                [f"{class_metadata.name}* this", f"{cls.gen_params(ctx.params())}"],
            ),
        )

        class_metadata.methods.append(
            MethodMetadata(
                name=method_name,
                return_type=return_type,
                params=method_params,
            )
        )

        method_header = (
            f"{return_type} {method_name}({class_metadata.methods[-1].params})"
        )

        method_block = ctx.block() and cls.gen_block(ctx.block()) or ""

        return f"{method_header} {method_block}"

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

        return f"{{\n{str.join('\n', map(cls.gen_stmt, stmts))}\n}}"

    @classmethod
    def gen_expr(cls, ctx: SugarcParser.ExprContext):
        if not ctx:
            return ""
        match type(ctx):
            case SugarcParser.ObjectInstantiationContext:
                class_name = ctx.getChild(1).getText()
                class_metadata = CompilerMetadata.get_class_metadata(class_name)
                constructor_params = cls.gen_expr_list(
                    SugarcParser.ObjectInstantiationContext.exprList(ctx)
                )
                return f"{class_metadata.constructor}({constructor_params})"
            case SugarcParser.FunctionCallContext:
                function_name = ctx.getChild(0).getText()

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
            ):
                left_exp = cls.gen_expr(ctx.getChild(0))
                operator = ctx.getChild(1).getText()
                right_exp = cls.gen_expr(ctx.getChild(2))

                return f"{left_exp} {operator} {right_exp}"

            case SugarcParser.TypeCastContext:
                cast_type = cls.gen_type(ctx.type_())
                expr = cls.gen_expr(ctx.expr())
                return f"({cast_type}) {expr}"

            case SugarcParser.SelfReferenceContext:
                if not ctx.expr():
                    cls.sintax_error(ctx)

                return f"this->{cls.gen_expr(ctx)}"

            case SugarcParser.MethodCallContext:

                return ""

            case SugarcParser.IndexAssignmentContext:
                array = ctx.ID().getText()
                index = cls.gen_expr(ctx.expr(0))
                expr = cls.gen_expr(ctx.expr(1))

                return f"{array}[{index}] = {expr}"

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
        if ctx.expr():
            return cls.gen_expr(ctx.expr())
        if ctx.varDecl():
            return cls.gen_var_decl(ctx.varDecl())
        if ctx.controlStmt():
            return cls.gen_control_stmt(ctx.controlStmt())
        if ctx.block():
            return cls.gen_block(ctx.block())
        if isinstance(ctx, ErrorNode):
            return cls.sintax_error(ctx)

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

            return f"for ({init_stmt} {condition_expr}; {update_expr}) {body_block}"
        if isinstance(while_stmt := ctx.whileStmt(), SugarcParser.WhileStmtContext):
            condition = cls.gen_expr(while_stmt.expr())
            body_block = cls.gen_stmt(while_stmt.stmt())
            return f"while ({condition}) {body_block}"

        return ctx.getText()

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
