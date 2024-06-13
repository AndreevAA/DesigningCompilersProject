# # Загрузите ANTLR
# curl -O https://www.antlr.org/download/antlr-4.9.3-complete.jar

# # Переместите скачанный jar-файл в директорию /usr/local/lib (или другую удобную для вас)
# mv antlr-4.9.3-complete.jar /usr/local/lib/

# # Добавьте переменные среды к вашему shell профилю (.bashrc, .zshrc и т.д.)
# echo 'export CLASSPATH=".:/usr/local/lib/antlr-4.9.3-complete.jar:$CLASSPATH"' >> ~/.zshrc
# echo 'alias antlr4="java -jar /usr/local/lib/antlr-4.9.3-complete.jar"' >> ~/.zshr
# echo 'alias grun="java org.antlr.v4.gui.TestRig"' >> ~/.zshrc

# # Примените изменения
# source ~/.zshrc

antlr4 -Dlanguage=Python3 Oberon.g4

python3 compile_oberon.py example.oberon

