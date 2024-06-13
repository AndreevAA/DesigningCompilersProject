import sys
from antlr4 import *
from ArrayReverseLexer import ArrayReverseLexer
from ArrayReverseParser import ArrayReverseParser
from ArrayReverseListener import ArrayReverseListener
from antlr4.InputStream import InputStream 

class MyArrayReverseListener(ArrayReverseListener):
    def __init__(self):
        self.elements = []

    def exitInt(self, ctx):
        # Каждый раз, когда мы достигаем терминального узла с числом, добавляем его значение в список
        self.elements.append(int(ctx.getText()))

def main():
    # Reading input for parsing from standard input
    input_stream = InputStream(input("Введите массив в формате [элементы]: "))

    # Creating lexer and parser
    lexer = ArrayReverseLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = ArrayReverseParser(stream)

    # Construct the listener and attach to parser
    listener = MyArrayReverseListener()
    tree = parser.array()
    walker = ParseTreeWalker()
    walker.walk(listener, tree)

    # Accessing collected elements and reversing
    reversed_elements = listener.elements[::-1]

    # Output the result
    print("Развернутый массив:", reversed_elements)

if __name__ == '__main__':
    main()