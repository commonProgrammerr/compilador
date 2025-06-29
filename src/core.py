from antlr4 import ParserRuleContext
from runtime.SugarcParser import SugarcParser


class SugarcCodeGenerator:
    """
    A class to generate C code from a Sugarc program context.
    This class contains methods to traverse the program context and generate C code.rn f"""

    output = ""

    type_func = {
        SugarcParser.ProgramContext.__name__: "gen_program",
        SugarcParser.StmtContext.__name__: "gen_stmt",
        SugarcParser.Class_declContext.__name__: "gen_class_decl",
    }

    @classmethod
    def children_filter(cls, child_type: type, ctx: ParserRuleContext):
        """Seleciona apenas os filhos de um contexto especifico"""

        return filter(lambda child: isinstance(child, child_type), ctx.children)

    @classmethod
    def gen(cls, ctx):
        ctx_type = type(ctx)
        try:
            generator = getattr(cls, cls.type_func[ctx_type.__name__])
            return generator and generator(ctx)
        except KeyError:
            print("skipping token: %s", type(ctx))
            pass

    @classmethod
    def gen_program(cls, ctx: SugarcParser.ProgramContext):
        for node in ctx.children:
            print(cls.gen(node))

    @classmethod
    def gen_stmt(cls, ctx: SugarcParser.StmtContext):
        if ctx.expr():
            return cls.gen_expr(ctx.expr())
        else:
            return ctx.getText()

    @classmethod
    def gen_class_base(cls, ctx: SugarcParser.Class_declContext):
        class_name = f"{ctx.getChild(1).getText()}_class"
        class_attrs = str.join(
            ",",
            map(cls.gen_field, cls.children_filter(SugarcParser.FieldContext, ctx)),
        )

        attrs_names = [attr.split(" ")[1] for attr in class_attrs.split(",")]

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
