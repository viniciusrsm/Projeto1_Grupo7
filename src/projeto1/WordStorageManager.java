package projeto1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordStorageManager implements DataStorage <String[]>{
    String[] data;

    public WordStorageManager(String filepath) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        StringBuffer text = new StringBuffer();
        String line;
        while(null != (line = reader.readLine())){
            
            text.append(line.replaceAll("[^\\w\\sà-üÀ-Ü]", "")).append(" ");
        }
        reader.close();
        data = text.toString().split(" ");
    }
    
    @Override
    public String[] data(){
        return data;
    }
    
}
