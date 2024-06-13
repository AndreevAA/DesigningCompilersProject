import sys
from antlr4 import FileStream, CommonTokenStream
from OberonLexer import OberonLexer
from OberonParser import OberonParser
from OberonListener import OberonListener


class PrintListener(OberonListener):
    def enterModule(self, ctx):
        module_name = ctx.IDENT().getText()
        print(f"Entering module: {module_name}")

    def exitModule(self, ctx):
        module_name = ctx.IDENT().getText()
        print(f"Exiting module: {module_name}")


def compile_oberon(file_path):
    # Create the lexer and parser
    input_stream = FileStream(file_path)
    lexer = OberonLexer(input_stream)
    tokens = CommonTokenStream(lexer)
    parser = OberonParser(tokens)

    # Parse the input, starting at the module rule
    tree = parser.module()

    # Create a generic parse tree walker
    walker = ParseTreeWalker()

    # Walk the tree with a custom listener
    listener = PrintListener()
    walker.walk(listener, tree)


if __name__ == '__main__':
    if len(sys.argv) < 2:
        print("Usage: compile_oberon.py <input-file>")
        sys.exit(1)

    input_file = sys.argv[1]
    compile_oberon(input_file)