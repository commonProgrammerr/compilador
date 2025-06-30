from dataclasses import dataclass, field
from antlr4 import ParserRuleContext
from runtime.SugarcParser import SugarcParser, ErrorNode
from sys import stderr


@dataclass
class ClassMetadata:
    name: str
    size: int  # size in bytes of class object
    attributes: dict[str, str]  # key: attribute name, value: attribute type
    methods: list[str] = field(default_factory=list)
    constructor: str = field(default_factory=str)
    extends: "ClassMetadata" | None = field(default=None)


class SugarcMetadata:
    type_sizes = {"int": 4, "float": 4, "bool": 1, "char*": 8}
    classes_metadata = dict()

    @classmethod
    def save_class_metadata(cls, class_metadata: ClassMetadata):
        cls.classes_metadata[class_metadata.name] = class_metadata

        return class_metadata

    @classmethod
    def get_class_metadata(cls, class_name: str) -> ClassMetadata:
        if class_name not in cls.classes_metadata:
            raise RuntimeError(f"Class {class_name} not found")

        return cls.classes_metadata[class_name]

    def create_class_metadata(cls, ctx: SugarcParser.ClassDeclContext):
        class_name = f"{ctx.getChild(1).getText()}"

        if class_name in cls.classes_metadata:
            raise RuntimeError("Class %s already exists!", class_name)

        class_attrs = {
            field.getChild(1).getText(): field.getChild(2).getText()
            for field in SugarcCodeGenerator.children_filter(
                SugarcParser.FieldContext, ctx
            )
        }

        class_size = sum(map(cls.type_sizes.get, class_attrs.values()))

        class_methods = [
            method_ctx.getChild(1).getText()
            for method_ctx in SugarcCodeGenerator.children_filter(
                SugarcParser.MethodContext, ctx
            )
        ]

        class_metadata = ClassMetadata(
            name=class_name,
            attributes=class_attrs,
            size=class_size,
            methods=class_methods,
        )

        if class_extends := ctx.classInherence():
            class_metadata.extends = cls.get_class_metadata(
                class_extends.getChild(1).getText()
            )

        return cls.save_class_metadata(class_metadata)


class SugarcCodeGenerator:
    """
    A class to generate C code from a Sugarc program context.
    This class contains methods to traverse the program context and generate C code.rn f"""

    output = ""

    type_func = {
        SugarcParser.ProgramContext.__name__: "gen_program",
        SugarcParser.StmtContext.__name__: "gen_stmt",
        SugarcParser.VarDeclContext.__name__: "gen_var_decl",
        SugarcParser.ClassDeclContext.__name__: "gen_class_decl",
        ErrorNode.__name__: "sintax_error",
    }

    @classmethod
    def sintax_error(ctx: ErrorNode):
        print(ctx, file=stderr)
        return ""

    @classmethod
    def children_filter(cls, child_type: type, ctx: ParserRuleContext):
        """Seleciona apenas os filhos de um contexto especifico"""

        return filter(lambda child: isinstance(child, child_type), ctx.children)

    @classmethod
    def gen(cls, ctx: ParserRuleContext):
        ctx_type = type(ctx)
        try:
            generator = getattr(cls, cls.type_func[ctx_type.__name__])
            return generator and generator(ctx)
        except KeyError:
            print("skipping token:", ctx.getText(), file=stderr)

    @classmethod
    def gen_program(cls, ctx: SugarcParser.ProgramContext):
        for node in ctx.children:
            print(cls.gen(node))

    @classmethod
    def gen_stmt(cls, ctx: SugarcParser.StmtContext):
        if ctx.expr():
            return cls.gen_expr(ctx.expr())
        if ctx.varDecl():
            return cls.gen_var_decl(ctx.varDecl())
        if ctx.controlStmt():
            return cls.gen_control_stmt(ctx.controlStmt())
        else:
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
                raise RuntimeError("Unknown command: %s", ctx.getText())

    @classmethod
    def gen_var_decl(cls, ctx: SugarcParser.VarDeclContext):
        var_type = cls.gen_type(ctx.type_())
        var_name = ctx.ID().getText()
        if not ctx.expr():
            return f"{var_type} {var_name};"

        var_value = cls.gen_expr(ctx.expr())
        return f"{var_type} {var_name} = {var_value};"

        class_constructor_block = (
            f"{{{str.join('', [f'this->{attr} = {attr};' for attr in attrs_names])}}}"
        )

        class_constructor = f"{class_name}_constructor ({class_name}* this, {class_attrs}) {class_constructor_block}"

        return (class_name, class_attrs, class_constructor)

    @classmethod
    def gen_class_decl(cls, ctx: SugarcParser.Class_declContext):
        class_name, class_attrs, class_constructor = cls.gen_class_base(ctx)

        class_methods = str.join(
            "\n",
            map(
                lambda child: cls.gen_method(child, class_name),
                cls.children_filter(SugarcParser.MethodContext, ctx),
            ),
        )

        # class_attr = e.g
        out = "struct %(class_name)s {%(class_attrs)s};"
        print(
            out
            % {
                "class_name": class_name,
                "class_attrs": class_attrs,
            }
        )
        print(class_constructor)
        print(class_methods)
        pass

    @classmethod
    def gen_field(cls, ctx: SugarcParser.FieldContext):
        field_type = ctx.getChild(0).getText()
        field_name = ctx.getChild(1).getText()
        return f"{field_type} {field_name}"

    @classmethod
    def gen_method(cls, ctx: SugarcParser.MethodContext, class_name: str):
        method_return_type = ctx.getChild(0).getText()
        method_name = ctx.getChild(1).getText()
        method_params = str.join(
            ",",
            filter(bool, [f"{class_name}* this", f"{cls.gen_params(ctx.params())}"]),
        )

        method_header = (
            f"{method_return_type} {class_name}_{method_name}({method_params})"
        )

        method_block = ctx.block() and cls.gen_block(ctx.block()) or ""

        return f"{method_header} {method_block}"

    @classmethod
    def gen_param(cls, ctx: SugarcParser.ParamsContext):
        param_type = ctx.getChild(0).getText()
        param_name = ctx.getChild(1).getText()

        return f"{param_type} {param_name}"

    @classmethod
    def gen_params(cls, ctx: SugarcParser.ParamsContext):
        if ctx:
            params = cls.children_filter(SugarcParser.ParamContext, ctx)
            return str.join(",", map(cls.gen_param, params))
        else:
            return ""

    @classmethod
    def gen_block(cls, ctx: SugarcParser.BlockContext):
        if not ctx:
            return ""

        return f"""{{{
            str.join(
                "",
                map(cls.gen_stmt, cls.children_filter(SugarcParser.StmtContext, ctx)),
            )
        }}}"""

    @classmethod
    def gen_expr(cls, ctx: SugarcParser.ExprContext):
        return ctx.getText()
