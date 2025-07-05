from antlr4 import ParserRuleContext
from pydantic import BaseModel, Field, field_serializer, field_validator
from typing import Optional
from runtime.SugarcParser import SugarcParser
from src.erros import SugarcSyntaxError

from typing import TYPE_CHECKING


class TypeMetadata(BaseModel):
    name: str
    size: int = Field(default=0)
    is_pointer: bool = Field(default=False)

    def __str__(self):
        return f"{self.name}{'*' if self.is_pointer else ''}"


class VariableMetadata(BaseModel):
    var_type: str
    name: str
    is_object: bool = Field(default=False)


class FunctionMetadata(BaseModel):
    name: str
    return_type: str = Field(default="void", serialization_alias="return")
    params: dict[str, VariableMetadata] = Field(default_factory=dict)
    variables: dict[str, VariableMetadata] = Field(default_factory=dict)


class MethodMetadata(BaseModel):
    name: str
    params: list[str] = Field(default_factory=list)
    return_type: str = Field(default="void", serialization_alias="return")
    is_constructor: bool = Field(default=False)
    is_automated: bool = Field(default=False)
    variables: dict[str, VariableMetadata] = Field(default_factory=dict)

    def __str__(self):
        return f"{self.return_type} {self.name}({self.serialize_params(self.params, None)})"

    @field_serializer("params")
    def serialize_params(self, params: list[str], _info):
        return str.join(", ", params) if params else "void"

    @classmethod
    def constructor(cls) -> "MethodMetadata":
        return cls(
            name="constructor",
            is_constructor=True,
            is_automated=True,
            return_type="void*",
        )


class ClassMetadata(BaseModel):
    type_name: str
    name: str
    attributes: dict[str, str] = Field(
        default_factory=dict
    )  # key: attribute name, value: attribute type
    methods: dict[str, MethodMetadata] = Field(default_factory=dict)
    constructor: MethodMetadata = Field(default_factory=MethodMetadata.constructor)
    inherence: Optional["ClassMetadata"] = Field(default=None)

    def __str__(self):
        return self.type_name

    @field_serializer("inherence")
    def serialize_inherence(self, inherence: "ClassMetadata", _info):
        return str(inherence) if inherence else "None"

    @field_serializer("methods")
    def serialize_methods(self, methods: dict[str, "MethodMetadata"], _info):
        return ";\n".join(map(str, methods.values()))

    @field_serializer("attributes")
    def serialize_attributes(self, attributes: dict[str, str], _info):
        return ";\n".join(f"{_type} {name}" for name, _type in attributes.items())

    @field_serializer("constructor")
    def serialize_constructor(self, constructor: MethodMetadata, _info):
        if constructor.return_type == "void*":
            constructor.return_type = f"{self.type_name}*"

        if constructor.name != f"{self.type_name}_constructor":
            constructor.name = f"{self.type_name}_constructor"

        return str(constructor)

    @field_validator("constructor", mode="before")
    def validate_constructor(cls, method: MethodMetadata):
        if not method.is_constructor:
            raise ValueError("Constructor must be marked as is_constructor=True")

        return method


class CompilerMetadata:
    classes_metadata = dict()
    defined_types = set()
    global_vars = dict()
    functions = dict()

    @classmethod
    def add_defined_type(cls, type_name: str):
        if type_name in cls.defined_types:
            raise RuntimeError("Type %s already defined!", type_name)

        cls.defined_types.add(type_name)
        return type_name

    @classmethod
    def save_class_metadata(cls, class_name, class_metadata: ClassMetadata):
        cls.classes_metadata[class_name] = class_metadata

        return class_metadata

    @classmethod
    def get_class_metadata_by_name(cls, class_name: str) -> ClassMetadata:
        if class_name not in cls.classes_metadata:
            raise RuntimeError("error: Class %s not found" % class_name)

        return cls.classes_metadata[class_name]

    @classmethod
    def get_class_metadata(cls, ctx: ParserRuleContext):
        parent = ctx
        while parent:
            if isinstance(parent, SugarcParser.ClassDeclContext):
                class_name = parent.getChild(1).getText()
                return cls.get_class_metadata_by_name(class_name)

            parent = parent.parentCtx

    @classmethod
    def get_method_metadata(cls, ctx: ParserRuleContext):
        parent = ctx
        while parent:

            # para a busca se ja tiver alcançado o contexto da classe
            if isinstance(parent, SugarcParser.ClassDeclContext):
                return cls.get_class_metadata(parent), None

            if isinstance(parent, SugarcParser.MethodDeclContext):
                class_name = parent.parentCtx.getChild(1).getText()
                method_name = parent.ID().getText()
                class_metadata = cls.get_class_metadata_by_name(class_name)
                try:
                    return class_metadata, class_metadata.methods[method_name]
                except KeyError:
                    raise SugarcSyntaxError(
                        "Syntax error: method '%s.%s' not found or exist."
                        % (class_name, method_name)
                    )

            parent = parent.parentCtx

        return None, None

    @classmethod
    def get_constructor_metadata(cls, ctx: ParserRuleContext):
        parent = ctx
        while parent:
            # para a busca se ja tiver alcançado o contexto da classe
            if isinstance(parent, SugarcParser.ClassDeclContext):
                return cls.get_class_metadata(parent), None

            if isinstance(parent, SugarcParser.ClassContructorDeclContext):
                class_metadata = cls.get_class_metadata(parent.parentCtx)
                return class_metadata, class_metadata.constructor

            parent = parent.parentCtx

        return None, None

    @classmethod
    def get_var_metadata(cls, ctx: SugarcParser.VarReferenceContext):

        parent = ctx
        var_name = ctx.ID().getText()

        while parent:
            if isinstance(parent, SugarcParser.ProgramContext):
                if var_name not in cls.global_vars:
                    raise SugarcSyntaxError(
                        "error: variable '%s' not found." % (var_name)
                    )

                return cls.global_vars[var_name]

            if is_contructor := isinstance(
                parent, SugarcParser.ClassContructorDeclContext
            ) or isinstance(parent, SugarcParser.MethodDeclContext):
                # if is_contructor:
                #     _, parent_metadata = cls.get_constructor_metadata(parent)
                # else:
                _, parent_metadata = cls.get_method_metadata(parent)

                if var_name not in parent_metadata.variables:
                    parent = parent.parentCtx
                    continue

                return parent_metadata.variables[var_name]

            parent = parent.parentCtx

    @classmethod
    def create_class_metadata(cls, ctx: SugarcParser.ClassDeclContext) -> ClassMetadata:
        class_name = f"{ctx.getChild(1).getText()}"

        if class_name in cls.classes_metadata:
            raise SugarcSyntaxError(
                "Syntax error: Class %s already exists!" % (class_name)
            )

        class_metadata = ClassMetadata(
            type_name=f"{class_name}_{hash(ctx):x}", name=class_name
        )

        if class_extends := ctx.classInherence():
            class_metadata.inherence = cls.get_class_metadata_by_name(
                class_extends.getChild(1).getText()
            )
        from src.core import SugarcCodeGenerator

        for attr in (
            *ctx.getTypedRuleContexts(SugarcParser.AttributeDeclarationContext),
            *ctx.getTypedRuleContexts(SugarcParser.ArrayAttributeDeclarationContext),
        ):
            class_metadata.attributes[attr.ID().getText()] = (
                SugarcCodeGenerator.gen_type(attr.type_())
            )

        return cls.save_class_metadata(class_name, class_metadata)
