package record;

import java.util.HashSet;
import java.util.Set;

public class SetInter {

    public static void main(String[] args) {

        // Create a Set using HashSet
        Set<String> fruits = new HashSet<>();

        // 1. add(E e)
        // Adds elements to the set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Set does not allow duplicate elements
        fruits.add("Apple");

        System.out.println("After add(): " + fruits);

        // 2. remove(Object o)
        // Removes the specified element from the set
        fruits.remove("Banana");

        System.out.println("After remove(): " + fruits);

        // 3. contains(Object o)
        // Checks whether the specified element is present
        System.out.println("Contains Apple: "
                + fruits.contains("Apple"));

        System.out.println("Contains Banana: "
                + fruits.contains("Banana"));

        // 4. size()
        // Returns the number of elements in the set
        System.out.println("Size of Set: "
                + fruits.size());

        // 5. isEmpty()
        // Checks whether the set is empty
        System.out.println("Is Set empty: "
                + fruits.isEmpty());

        // 6. clear()
        // Removes all elements from the set
        fruits.clear();

        System.out.println("After clear(): " + fruits);

        // Check whether the set is empty after clear()
        System.out.println("Is Set empty after clear(): "
                + fruits.isEmpty());
    }
}
