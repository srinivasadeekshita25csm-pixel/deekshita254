package record;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInter {

    public static void main(String[] args) {

        // Create a Collection using ArrayList
        Collection<String> fruits = new ArrayList<>();

        // 1. add(E e)
        // Adds individual elements to the collection
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("After add(): " + fruits);

        // 2. addAll(Collection<? extends E> c)
        // Create another collection
        Collection<String> moreFruits = new ArrayList<>();

        moreFruits.add("Orange");
        moreFruits.add("Grapes");

        // Add all elements of moreFruits to fruits
        fruits.addAll(moreFruits);

        System.out.println("After addAll(): " + fruits);

        // 3. remove(Object o)
        // Removes the specified element
        fruits.remove("Banana");

        System.out.println("After remove(): " + fruits);

        // 4. removeAll(Collection<?> c)
        // Removes all elements that are present in another collection
        Collection<String> removeFruits = new ArrayList<>();

        removeFruits.add("Orange");
        removeFruits.add("Grapes");

        fruits.removeAll(removeFruits);

        System.out.println("After removeAll(): " + fruits);

        // 5. contains(Object o)
        // Checks whether the collection contains an element
        System.out.println("Contains Apple: "
                + fruits.contains("Apple"));

        // 6. containsAll(Collection<?> c)
        // Checks whether the collection contains all elements
        // of another collection
        Collection<String> checkFruits = new ArrayList<>();

        checkFruits.add("Apple");
        checkFruits.add("Mango");

        System.out.println("Contains Apple and Mango: "
                + fruits.containsAll(checkFruits));

        // 7. size()
        // Returns the number of elements
        System.out.println("Size of collection: "
                + fruits.size());

        // 8. isEmpty()
        // Checks whether the collection is empty
        System.out.println("Is collection empty: "
                + fruits.isEmpty());

        // 9. iterator()
        // Creates an iterator to access elements one by one
        System.out.println("Elements using iterator:");

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 10. clear()
        // Removes all elements from the collection
        fruits.clear();

        System.out.println("After clear(): " + fruits);

        // Check whether collection is empty after clear()
        System.out.println("Is collection empty after clear(): "
                + fruits.isEmpty());
    }
}
