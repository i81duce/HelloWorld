import java.util.ArrayList;
import java.util.HashMap;

public class DynamicDataStructures {
    public static void main(String[] args) {
        Person alice = new Person("Alice", 25);
        Person bob = new Person("Bob", 30);
        Person charlie = new Person("Charlie", 40);

        ArrayList<Person> people = new ArrayList();
        people.add(alice);
        people.add(bob);
        people.add(charlie);

        for (Person p : people) {
            System.out.println(p.getName());
        }

        //Alternate for loop -       for (int i = 0; i < people.size(); i++)

        HashMap<String, Person> peopleMap = new HashMap<>();
        peopleMap.put("Alice", alice);
        peopleMap.put("Bob", bob);
        peopleMap.put("Charlie", charlie);

        for (Person p : peopleMap.values()) {
            if (p.getAge() >= 30) {
                System.out.println(p.getName());
            }
        }
    }
}