package basics;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterface {
    public static void main(String[] args) {

        ArrayList<String> subjects = new ArrayList<>();

        subjects.add("Java");
        subjects.add("Python");
        subjects.add("Operating Systems");
        subjects.add("Computer Networks");
        subjects.add("TOC");

        System.out.println("Subjects:");

        Iterator<String> iterator =
                subjects.iterator();

        while (iterator.hasNext()) {
            String subject = iterator.next();
            System.out.println(subject);
        }

        System.out.println("\nRemoving Python:");

        iterator = subjects.iterator();

        while (iterator.hasNext()) {

            String subject = iterator.next();

            if (subject.equals("Python")) {
                iterator.remove();
            }
        }

        System.out.println("After Removal: "
                + subjects);

        System.out.println("Total Subjects: "
                + subjects.size());

        System.out.println("\nRemaining Subjects:");

        iterator = subjects.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


