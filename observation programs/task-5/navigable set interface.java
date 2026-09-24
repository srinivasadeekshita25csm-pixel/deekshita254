package record;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetInter {

    public static void main(String[] args) {

        // Create a NavigableSet using TreeSet
        NavigableSet<Integer> numbers = new TreeSet<>();

        // Add elements to the set
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Display the elements in ascending order
        System.out.println("NavigableSet: " + numbers);

        // 1. lower(E e)
        // Returns the greatest element strictly less than 30
        System.out.println("Lower than 30: "
                + numbers.lower(30));

        // 2. floor(E e)
        // Returns the greatest element less than or equal to 30
        System.out.println("Floor of 30: "
                + numbers.floor(30));

        // 3. ceiling(E e)
        // Returns the least element greater than or equal to 35
        System.out.println("Ceiling of 35: "
                + numbers.ceiling(35));

        // 4. higher(E e)
        // Returns the least element strictly greater than 30
        System.out.println("Higher than 30: "
                + numbers.higher(30));

        // 5. pollFirst()
        // Retrieves and removes the lowest element
        System.out.println("Poll First: "
                + numbers.pollFirst());

        // Display the set after removing the first element
        System.out.println("After pollFirst(): "
                + numbers);

        // 6. pollLast()
        // Retrieves and removes the highest element
        System.out.println("Poll Last: "
                + numbers.pollLast());

        // Display the set after removing the last element
        System.out.println("After pollLast(): "
                + numbers);

        // 7. descendingSet()
        // Returns the elements in reverse order
        System.out.println("Descending Set: "
                + numbers.descendingSet());
    }
}
