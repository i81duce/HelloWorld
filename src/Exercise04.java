import java.util.HashMap;

public class Exercise04 {
    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question.";
        // Create this: To be or not, that is the question.
        sentence = sentence.toLowerCase();
        sentence = sentence.replace(",", "").replace(".", "");
        String[] words = sentence.split(" ");
        HashMap<String, Integer> duplicates = new HashMap<>();
        System.out.println(duplicates);
    }
}
