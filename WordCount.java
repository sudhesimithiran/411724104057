import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a sentence:");
        String text = br.readLine();

        String words[] = text.trim().split("\\s+");

        int count = words.length;

        System.out.println("Word count: " + count);
    }
}