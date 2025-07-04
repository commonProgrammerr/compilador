from pydantic import BaseModel, Field, field_serializer, field_validator
from typing import Optional
from runtime.SugarcParser import SugarcParser


class TypeMetadata(BaseModel):
    name: str
    size: int = Field(default=0)
    is_pointer: bool = Field(default=False)

    def __str__(self):
        return f"{self.name}{'*' if self.is_pointer else ''}"


class MethodMetadata(BaseModel):
    name: str
    params: list[str] = Field(default_factory=list)
    return_type: str = Field(default="void")
    is_constructor: bool = Field(default=False)
    is_automated: bool = Field(default=False)

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
    name: str
    attributes: dict[str, str] = Field(
        default_factory=dict
    )  # key: attribute name, value: attribute type
    methods: list[MethodMetadata] = Field(default_factory=list)
    constructor: MethodMetadata = Field(default_factory=MethodMetadata.constructor)
    inherence: Optional["ClassMetadata"] = Field(default=None)

    def __str__(self):
        return self.name

    @field_serializer("inherence")
    def serialize_inherence(self, inherence: "ClassMetadata", _info):
        return str(inherence) if inherence else "None"

    @field_serializer("methods")
    def serialize_methods(self, methods: "MethodMetadata", _info):
        return ";\n".join(map(str, methods))

    @field_serializer("attributes")
    def serialize_attributes(self, attributes: dict[str, str], _info):
        return ";\n".join(f"{_type} {name}" for name, _type in attributes.items())

    @field_serializer("constructor")
    def serialize_constructor(self, constructor: MethodMetadata, _info):
        if constructor.return_type == "void*":
            constructor.return_type = f"{self.name}*"

        if constructor.name != f"{self.name}_constructor":
            constructor.name = f"{self.name}_constructor"

        return str(constructor)

    @field_validator("constructor", mode="before")
    def validate_constructor(cls, method: MethodMetadata):
        if not method.is_constructor:
            raise ValueError("Constructor must be marked as is_constructor=True")

        return method


class CompilerMetadata:
    type_sizes = {"int": 4, "float": 4, "bool": 1, "char*": 8}
    classes_metadata = dict()
    defined_types = set()

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
    def get_class_metadata(cls, class_name: str) -> ClassMetadata:
        if class_name not in cls.classes_metadata:
            raise RuntimeError("Class %s not found", class_name)

        return cls.classes_metadata[class_name]

    @classmethod
    def create_class_metadata(cls, ctx: SugarcParser.ClassDeclContext) -> ClassMetadata:
        class_name = f"{ctx.getChild(1).getText()}"

        if class_name in cls.classes_metadata:
            raise RuntimeError("Class %s already exists!", class_name)

        class_metadata = ClassMetadata(name=f"{class_name}_{hash(ctx):x}")

        if class_extends := ctx.classInherence():
            class_metadata.inherence = cls.get_class_metadata(
                class_extends.getChild(1).getText()
            )

        return cls.save_class_metadata(class_name, class_metadata)
