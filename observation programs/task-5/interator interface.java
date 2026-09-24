package record;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorInter {

    public static void main(String[] args) {

        // Creating a list
        List<String> students = new ArrayList<>();

        // Adding elements to the list
        students.add("Ravi");
        students.add("Sita");
        students.add("Arun");
        students.add("Priya");
        students.add("Kiran");

        // Creating Iterator
        Iterator<String> itr = students.iterator();

        // hasNext() and next()
        System.out.println("Elements using hasNext() and next():");

        while (itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);
        }

        // Creating a new Iterator for remove()
        itr = students.iterator();

        while (itr.hasNext()) {
            String name = itr.next();

            // Removing Arun
            if (name.equals("Arun")) {
                itr.remove();
            }
        }

        System.out.println("\nAfter remove(): " + students);

        // Creating a new Iterator for forEachRemaining()
        itr = students.iterator();

        // Moving to the first element
        if (itr.hasNext()) {
            System.out.println("\nFirst element: " + itr.next());
        }

        // forEachRemaining()
        System.out.println("Remaining elements using forEachRemaining():");

        itr.forEachRemaining(name -> System.out.println(name));
    }
}
