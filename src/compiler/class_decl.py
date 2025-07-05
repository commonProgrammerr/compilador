import os
from src.compiler.metadata import CompilerMetadata
from runtime.SugarcParser import SugarcParser
from src.contraints import get_template_paths, cache_dir


def compile(ctx: SugarcParser.ClassDeclContext) -> str:

    metadata = CompilerMetadata.create_class_metadata(ctx)
    cache_file = os.path.join(cache_dir, metadata.type_name)
    if os.path.exists(cache_file):
        return open(cache_file, "r").read()

    # with open(cache_file, "w") as f:

    header_template, sourcer_template = get_template_paths("classDecl")
    return open(header_template, "r").read() % metadata.model_dump()
