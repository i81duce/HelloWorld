import jodd.madvoc.meta.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Exercise06 {
    public static void main(String[] args) {
        String [] names = {"Alice", "Smith", "Bob", "Hope", "Charlie", "Brown"};
        // reverse list
        // turn it into a HashMap
        // {"Smith":"Alive", "Hope":"Bob"}

//        // 1st way to do this
//        //String [] reversedNames = new String[names.length];
//        ArrayList<String> reversedNames = new ArrayList<>();
//        for (int i = names.length-1; i >= 0; i--) {
//            reversedNames.add(names[i]);
//        }

        // 2nd way to do this
        ArrayList<String> reversedNames = new ArrayList<>(Arrays.asList(names));
        Collections.reverse(reversedNames);

        // turn into HashMap
        HashMap<String, String> nameMap = new HashMap<>();
        for (int i = 0; i < reversedNames.size(); i += 2) {
            nameMap.put(reversedNames.get(i), reversedNames.get(i + 1));
        }

        System.out.println(nameMap);
    }
}
