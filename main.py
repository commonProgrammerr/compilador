from runtime.SugarcLexer import SugarcLexer
from runtime.SugarcParser import SugarcParser
from src.core import SugarcCodeGenerator
from antlr4 import FileStream, CommonTokenStream
import sys


def main():
    if len(sys.argv) != 2:
        print(f"Usage: python {__file__} <input_file>")
        sys.exit(1)

    input_file = sys.argv[1]

    # Create a lexer that feeds off the input file
    lexer = SugarcLexer(FileStream(input_file, encoding="utf-8"))

    # Create a token stream from the lexer
    token_stream = CommonTokenStream(lexer)

    # Create a parser that feeds off the token stream
    parser = SugarcParser(token_stream)

    # Parse the input file and get the parse tree
    tree = parser.program()

    SugarcCodeGenerator.gen_program(tree)


if __name__ == "__main__":
    main()
