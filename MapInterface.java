package basics;
import java.util.Map;
import java.util.HashMap;

public class MapInterface {
    public static void main(String[] args) {

        Map<Integer, String> students =
                new HashMap<>();

        students.put(101, "Sita");
        students.put(102, "Anu");
        students.put(103, "Ravi");
        students.put(104, "Kiran");
        students.put(105, "Priya");

        System.out.println("Student Map: "
                + students);

        System.out.println("Student with ID 103: "
                + students.get(103));

        students.put(103, "Rahul");

        System.out.println("After updating ID 103: "
                + students);

        students.remove(105);

        System.out.println("After removing ID 105: "
                + students);

        System.out.println("Contains Key 102: "
                + students.containsKey(102));

        System.out.println("Contains Value Sita: "
                + students.containsValue("Sita"));

        System.out.println("Number of Students: "
                + students.size());

        System.out.println("\nKeys:");

        for (Integer id : students.keySet()) {
            System.out.println(id);
        }

        System.out.println("\nValues:");

        for (String name : students.values()) {
            System.out.println(name);
        }

        System.out.println("\nKey-Value Pairs:");

        for (Map.Entry<Integer, String> entry
                : students.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> "
                    + entry.getValue());
        }
    }
}
