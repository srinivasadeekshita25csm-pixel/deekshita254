package record;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInter {

    public static void main(String[] args) {

        // Create a SortedSet using TreeSet
        SortedSet<Integer> numbers = new TreeSet<>();

        // Add elements to the SortedSet
        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(10);
        numbers.add(40);
        numbers.add(70);

        // TreeSet automatically sorts the elements
        System.out.println("SortedSet: " + numbers);

        // 1. first()
        // Returns the lowest element
        System.out.println("First element: "
                + numbers.first());

        // 2. last()
        // Returns the highest element
        System.out.println("Last element: "
                + numbers.last());

        // 3. headSet(E toElement)
        // Returns elements smaller than the given element
        System.out.println("HeadSet before 50: "
                + numbers.headSet(50));

        // 4. tailSet(E fromElement)
        // Returns elements greater than or equal to the given element
        System.out.println("TailSet from 40: "
                + numbers.tailSet(40));

        // 5. subSet(E fromElement, E toElement)
        // Returns elements from 20 (inclusive)
        // to 70 (exclusive)
        System.out.println("SubSet from 20 to 70: "
                + numbers.subSet(20, 70));

        // 6. comparator()
        // Returns the comparator used for ordering.
        // null means natural ascending order is used.
        System.out.println("Comparator: "
                + numbers.comparator());
    }
}
