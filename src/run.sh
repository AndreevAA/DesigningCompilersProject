# sh install.sh
rm ph/parser.out
# python test.py

python compiler/code_gen.py

# python compiler/code_gen.py test-cases/*.txt

spim -file new.asm
