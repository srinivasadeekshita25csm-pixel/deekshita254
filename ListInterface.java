package basics;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListInterface {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        students.add("Sita");
        students.add("Anu");
        students.add("Ravi");
        students.add("Kiran");

        System.out.println("Student List: "
                + students);

        students.add(2, "Priya");

        System.out.println("After inserting Priya: "
                + students);

        System.out.println("Student at index 1: "
                + students.get(1));

        students.set(0, "Seetha");

        System.out.println("After updating first student: "
                + students);

        students.remove(2);

        System.out.println("After removing index 2: "
                + students);

        students.remove("Kiran");

        System.out.println("After removing Kiran: "
                + students);

        System.out.println("Contains Anu: "
                + students.contains("Anu"));

        System.out.println("Index of Anu: "
                + students.indexOf("Anu"));

        System.out.println("Size: "
                + students.size());

        System.out.println("\nStudents using for-each:");

        for (String student : students) {
            System.out.println(student);
        }

        Collections.sort(students);

        System.out.println("\nSorted List: "
                + students);

        Collections.reverse(students);

        System.out.println("Reverse List: "
                + students);
    }
}

