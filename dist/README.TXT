=================
EXECUÇÃO DA BUILD
=================
Quando você constrói um projeto de aplicação Java que possui uma classe principal, a IDE automaticamente copia todos os arquivos JAR no caminho de classes do projeto para a pasta dist/lib do seu projeto. A IDE também adiciona cada um dos arquivos JAR ao elemento Class-Path no arquivo manifesto (MANIFEST.MF) dos arquivos JAR da aplicação.

O arquivo executável jar já está disponível em nosso repositório na pasta dist, juntamente com os arquivos words.txt e e stop_words.txt. É possível alterar o nome e pathing do words.txt, já o stop_words.txt deve se manter igual.

Para executar o projeto a partir da linha de comando, vá até a pasta dist e digite o seguinte:

java -jar "projeto1.jar" "caminho para o arquivo .txt com as palavras" (words.txt)

Após a execução será possível ver como output a frequência das palavras em words.txt, com exceção das palavras presentes em stop_words.txt.
