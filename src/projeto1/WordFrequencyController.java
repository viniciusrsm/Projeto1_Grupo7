/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto1;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 *
 * @author Vinicius
 */
public class WordFrequencyController {
    WordStorageManager storage;
    StopWordManager stop_word_manager;
    WordFrequencyManager word_freq_counter;
    
    public WordFrequencyController(String filepath) throws IOException {
        storage = new WordStorageManager(filepath);
        stop_word_manager = new StopWordManager("./stop_words.txt");
        word_freq_counter = new WordFrequencyManager();
    }
    
    public void run() {
        for (String w : storage.data()) {
            if (!stop_word_manager.contains(w)) {
                word_freq_counter.increment_count(w);
            }
        }
        
        LinkedHashMap<String, Integer> word_freqs = word_freq_counter.sorted();
        
        Set<String> words = word_freqs.keySet();
        
        
        for (String word : words) {
            System.out.println(word + " - " + word_freqs.get(word));
        }
    }
}
