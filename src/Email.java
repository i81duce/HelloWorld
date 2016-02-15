import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Objects;

public class Email implements Comparable { // first time using implements and Comparable
    String destination;
    String subject;
    String body;

    public Email(String destination, String subject, String body) {
        this.destination = destination;
        this.subject = subject;
        this.body = body;
    }

    @Override
    public int compareTo(Object o) {
        Email e = (Email) o; /////// WHAT THE HELL IS THIS????
        return destination.compareTo(e.destination);
    }

    @Override
    public String toString() {
        return "Email{" +
                "destination='" + destination + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
