package basics;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;

public class SortedMapInterface {
    public static void main(String[] args) {

        SortedMap<Integer, String> students =
                new TreeMap<>();

        students.put(104, "Kiran");
        students.put(101, "Sita");
        students.put(103, "Ravi");
        students.put(102, "Anu");
        students.put(105, "Priya");

        System.out.println("Sorted Map: "
                + students);

        System.out.println("First Key: "
                + students.firstKey());

        System.out.println("Last Key: "
                + students.lastKey());

        System.out.println("First Student: "
                + students.get(
                students.firstKey()));

        System.out.println("Last Student: "
                + students.get(
                students.lastKey()));

        System.out.println("Head Map: "
                + students.headMap(104));

        System.out.println("Tail Map: "
                + students.tailMap(103));

        System.out.println("Sub Map: "
                + students.subMap(102, 105));

        System.out.println("\nAll Students:");

        for (Map.Entry<Integer, String> entry
                : students.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> "
                    + entry.getValue());
        }

        students.remove(103);

        System.out.println("\nAfter removing ID 103:");

        System.out.println(students);
    }
}

