package projeto1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class WordFrequencyManager implements FrequencyCounter<String> {
    public HashMap<String, Integer> wordFreq = new HashMap<>();
    
    @Override
    public void increment_count(String word) {
        if (wordFreq.containsKey(word)) {
            wordFreq.put(word, wordFreq.get(word) + 1);
        }
        else {
            wordFreq.put(word, 1);
        }
    }

    @Override
    public LinkedHashMap<String, Integer> sorted() {
        LinkedHashMap<String, Integer> sortedWordFreq = new LinkedHashMap<>();
        ArrayList<Integer> listFreq = new ArrayList<>(wordFreq.values());
        Collections.sort(listFreq, Collections.reverseOrder());
        
        for (Integer freq : listFreq) {
            for (Entry<String, Integer> entry : wordFreq.entrySet()) {
                if (entry.getValue().equals(freq)) {
                    sortedWordFreq.put(entry.getKey(), freq);
                }
            }
        }
        
        return sortedWordFreq;
    }
}
