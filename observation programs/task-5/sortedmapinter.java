package record;


import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInter {

    public static void main(String[] args) {

        // Create a SortedMap using TreeMap
        SortedMap<Integer, String> students = new TreeMap<>();

        // Add key-value pairs to the SortedMap
        students.put(103, "Arun");
        students.put(101, "Ravi");
        students.put(105, "Priya");
        students.put(102, "Sita");
        students.put(104, "Kiran");

        // TreeMap automatically sorts the keys
        System.out.println("SortedMap: " + students);

        // 1. firstKey()
        // Returns the lowest key
        System.out.println("First Key: "
                + students.firstKey());

        // 2. lastKey()
        // Returns the highest key
        System.out.println("Last Key: "
                + students.lastKey());

        // 3. headMap(K toKey)
        // Returns entries whose keys are less than 104
        System.out.println("HeadMap before 104: "
                + students.headMap(104));

        // 4. tailMap(K fromKey)
        // Returns entries whose keys are greater than
        // or equal to 103
        System.out.println("TailMap from 103: "
                + students.tailMap(103));

        // 5. subMap(K fromKey, K toKey)
        // Returns entries from key 102 (inclusive)
        // to key 105 (exclusive)
        System.out.println("SubMap from 102 to 105: "
                + students.subMap(102, 105));

        // 6. comparator()
        // Returns the comparator used for ordering.
        // null means natural ascending order is used.
        System.out.println("Comparator: "
                + students.comparator());
    }
}
