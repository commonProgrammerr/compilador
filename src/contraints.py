import os
from yaml import safe_load

root_dir = os.path.abspath(os.path.join(os.path.dirname(os.path.abspath(__file__)), ".."))
src_dir = os.path.join(root_dir, "src")
cache_dir = os.path.join(root_dir, "build", ".cache")


def get_template_paths(template_name: str) -> str:
    with open(os.path.join(src_dir, "templates_list.yml"), "r") as f:
        templates = safe_load(f)["templates"]

    if template_name not in templates:
        raise ValueError(f"Template '{template_name}' not found in templates_list.yaml")

    template_files = templates[template_name]["files"]
    return (
        os.path.join(root_dir, template_files["header"]),
        os.path.join(root_dir, template_files["source"]),
    )
