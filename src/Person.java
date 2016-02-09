/**
 * Created by KevinBozic on 2/2/16.
 */
public class Person {
    public String name;
    public int age;
    public boolean isAlive = true;
    public String address;
    //public String[] addresses = new String[10]; // This is initializing the num. of items in an array
    //public static StreetAddress address;

    public Person() {

    }

    public Person(String name, int age) {
        this(name, age, true);
    }

    public Person(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (isValidName(newName)) {
            name = newName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean newIsAlive) {
        isAlive = newIsAlive;
    }



    public static boolean isValidName(String name) {
        return name.contains(" ");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                ", address='" + address + '\'' +
                '}';
    }
}