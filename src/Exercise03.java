import java.util.HashMap;

public class Exercise03 {
    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question.";
        // normalize everything; T to t, get rid of punctuation
        sentence = sentence.toLowerCase(); // lowercase everything
        sentence = sentence.replace(",", "").replace(".", ""); // can do this on 1 line instead of 2
        // sentence = sentence.replace(".", "");
        String[] words = sentence.split(" ");// split by spaces
        HashMap<String, Integer> frequencies = new HashMap<>();// Creating hashmap
        for (String word : words) { // looping over a single word in words
            Integer count = frequencies.get(word); // ?????
            if (count == null) { // if it doesn't exist
                frequencies.put(word, 1);
            } else { // if it DOES exist
                frequencies.put(word, count + 1);
            }
        }
        System.out.println(frequencies);
    }
}