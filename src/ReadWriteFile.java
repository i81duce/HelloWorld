import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        File f = new File("names.txt");
        FileWriter fw = new FileWriter(f);
        fw.write("Alice\n"); // overwrites file. THIS WRITES A FILE
        fw.append("Bob\n");
        fw.append("Charlie\n");
        fw.close();

        Scanner scanner = new Scanner(f); // THIS READS A FILE

        // read line by line
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        // read entire file
        scanner = new Scanner(f);
        scanner.useDelimiter("\\Z"); // no idea what the hell this is!!!
        String contents = scanner.next();
        System.out.println(contents);



    }
}
