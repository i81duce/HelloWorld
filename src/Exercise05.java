import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise05 {
    public static void main(String[] args) {
        String[] names = {"alice", "bob", "charlie", "andrew", "edward", "alex"};

        // put the first 5 in new data structure.
        ArrayList<String> newNames = new ArrayList<>(Arrays.asList(names));
        newNames = new ArrayList<>(newNames.subList(0, 5));

        solveViaStream(newNames);
        solveViaTempLists(newNames);
        solveViaDirectModification(newNames);

    }

    // EXAMPLE 1
    static void solveViaDirectModification(ArrayList<String> names) { // need to understand arguments in methods
        // make all the names uppercase
        for (int i = 0; i < names.size(); i++) {
            names.set(i, names.get(i).toUpperCase());
        }

        // filter out the ones that don't start with 'A'
        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            if (!name.startsWith("A")) {
                iter.remove();
            }
        }

        System.out.println(names);
    }

    // EXAMPLE 2
    static void solveViaTempLists(ArrayList<String> names) { // need to understand arguments in methods
        // make all the names uppercase
        ArrayList<String> temp = new ArrayList<>();
        for (String name : names) {
            temp.add(name.toUpperCase());
        }
        names = temp;

        // filter out the ones that don't start with 'A'
        temp = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("A")) {
                temp.add(name);
            }
        }
        names = temp;

        System.out.println(names);
    }

    // EXAMPLE 3
    static void solveViaStream(ArrayList<String> names) {
        names = names.stream()
                .map((name) -> {
                    return name.toUpperCase();
                })
                .filter((name) -> {
                    return name.startsWith("A");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new)); // converts it back into an ArrayList

        System.out.println(names);
    }
}
