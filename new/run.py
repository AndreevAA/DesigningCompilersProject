import antlr4
from OberonLexer import OberonLexer
from OberonParser import OberonParser

def oberon_to_python(oberon_code):
    input_stream = antlr4.InputStream(oberon_code)
    lexer = OberonLexer(input_stream)
    stream = antlr4.CommonTokenStream(lexer)
    parser = OberonParser(stream)
    tree = parser.startRule()  # Измените startRule на актуальное начальное правило

    # Здесь должно быть преобразование AST в Python код
    # Это место для реализации вашего интерпретатора или транслятора
    
    python_code = ""  # Ваш преобразованный код
    return python_code

# Исходный код Oberon
oberon_code = """
MODULE Example;
BEGIN
    WriteLn('Hello from Oberon');
END Example.
"""

# Конвертация и вывод
python_output = oberon_to_python(oberon_code)
print(python_output)