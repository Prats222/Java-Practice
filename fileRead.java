import java.io.BufferedReader; // used for reading text from file.
import java.io.FileReader; // used to read character files.
import java.io.IOException; // it is an exception for reading a file.

public class fileRead {
    public static void main(String[] args) {
        String fileName = "test.txt";
        int lineCount = 0;
        int wordCount = 0;
        int letterCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;

                String[] words = line.split("\\s+");
                wordCount += words.length;

                for (String word : words) {
                    letterCount += word.length();
                }
            }
            System.out.println("Line count: " + lineCount);
            System.out.println("Word count: " + wordCount);
            System.out.println("Letter count: " + letterCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// Context api in project
// Embedded System
// c++ life cycle