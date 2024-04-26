package projeto1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;

public class StopWordManager implements Filter <String>{
    // HashSet contendo todas as Stop Word
    private HashSet<String> words = new HashSet();

    public StopWordManager(String filepath) throws FileNotFoundException, IOException {
        //Abertura do Arquivo pelo seu caminho (pathfile)
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        StringBuffer text = new StringBuffer();
        String line;
        // Leitura dos dados do Arquivo em StringBuffer
        while(null != (line = reader.readLine())){
            // Eliminação de simbolos não alfanumericos por Regex
            text.append(line.replaceAll("/[^\\w\\s]/gi", ""));
        }
        reader.close();
        // Adição de palavras no Hashset
        Collections.addAll(words, text.toString().toLowerCase().split(" "));
        
        
    }
    
    @Override
    public boolean contains(String word){
        // Retorn True se a word estiver no Hashset
        return words.contains(word.toLowerCase());
    }
}
