from antlr4.tree.Tree import ErrorNode

from runtime.SugarcParser import SugarcParser


class SugarcSyntaxError(RuntimeError):

    def __init__(self, *args: object) -> None:
        super().__init__(*args)
