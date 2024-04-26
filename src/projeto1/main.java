package projeto1;
import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        WordFrequencyController wordFrequencyController = new WordFrequencyController(args[0]);
        wordFrequencyController.run();
    }
    
}
