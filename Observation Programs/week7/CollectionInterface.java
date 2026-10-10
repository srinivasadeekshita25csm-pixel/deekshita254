package basics;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CollectionInterface {
    public static void main(String[] args) {

        Collection<String> students = new ArrayList<>();

        students.add("Swetha");
        students.add("Anu");
        students.add("Ravi");
        students.add("Kiran");
        students.add("Sita");

        System.out.println("Students: " + students);

        students.addAll(Arrays.asList("Rahul", "Priya"));

        System.out.println("After addAll: " + students);

        System.out.println("Contains Swetha: "
                + students.contains("Swetha"));

        System.out.println("Contains Anu and Ravi: "
                + students.containsAll(
                Arrays.asList("Anu", "Ravi")));

        System.out.println("Size: " + students.size());

        students.remove("Ravi");

        System.out.println("After removing Ravi: "
                + students);

        students.removeAll(
                Arrays.asList("Anu", "Sita"));

        System.out.println("After removeAll: "
                + students);

        System.out.println("Is Empty: "
                + students.isEmpty());

        System.out.println("\nUsing Iterator:");

        Iterator<String> it = students.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        students.clear();

        System.out.println("\nAfter clear: "
                + students);
    }
}

