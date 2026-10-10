package basics;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapInterface {
    public static void main(String[] args) {

        NavigableMap<Integer, String> marks =
                new TreeMap<>();

        marks.put(50, "Fail");
        marks.put(60, "Pass");
        marks.put(70, "First Class");
        marks.put(80, "Distinction");
        marks.put(90, "Excellent");

        System.out.println("Marks Map: "
                + marks);

        System.out.println("First Key: "
                + marks.firstKey());

        System.out.println("Last Key: "
                + marks.lastKey());

        System.out.println("Lower Key of 80: "
                + marks.lowerKey(80));

        System.out.println("Higher Key of 80: "
                + marks.higherKey(80));

        System.out.println("Floor Key of 75: "
                + marks.floorKey(75));

        System.out.println("Ceiling Key of 75: "
                + marks.ceilingKey(75));

        System.out.println("First Entry: "
                + marks.firstEntry());

        System.out.println("Last Entry: "
                + marks.lastEntry());

        System.out.println("\nDescending Map:");

        System.out.println(marks.descendingMap());

        System.out.println("\nDescending Keys:");

        for (Integer key :
                marks.descendingKeySet()) {

            System.out.println(key);
        }
    }
}
