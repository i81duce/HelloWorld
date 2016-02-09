import java.util.ArrayList;

public class PersonFinder {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 35));
        people.add(new Person("Charlie", 40));

        ArrayList<Person> peopleUnder40 = new ArrayList<>();
        for (Person p : people) {
            if (p.getAge() < 40) {
                peopleUnder40.add(p);
            }
        }
        System.out.println(peopleUnder40);

        Person firstMatch = null;
        for (Person p : people) {
            if (!p.getName().startsWith("A")) {
                firstMatch = p;
                break;
            }
        }
        System.out.println(firstMatch);
    }
}
