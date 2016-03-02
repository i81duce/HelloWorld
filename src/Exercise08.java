import java.util.ArrayList;

public class Exercise08 {
    public static void main(String[] args) {
        String[] names = {"Charlie", "David", "Alice", "Bob"};
        ArrayList<String> sortedNames = new ArrayList<>();

        for (String name : names) {
            int index = 0;
            for (String sortedName : sortedNames) {
                if (name.compareTo(sortedName) > 0) {
                    index += 1;
                }
                else {
                    break;
                }
            }
            sortedNames.add(index, name);
        }

        System.out.println(sortedNames);

    }
}
