package record;

import java.util.ArrayList;
import java.util.List;

public class ListInter {

    public static void main(String[] args) {

        // Create a List using ArrayList
        List<String> fruits = new ArrayList<>();

        // 1. add(E e)
        // Adds an element at the end of the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana"); // List allows duplicate elements

        System.out.println("After add(): " + fruits);

        // 2. add(int index, E element)
        // Inserts an element at the specified index
        fruits.add(1, "Orange");

        System.out.println("After add(index, element): " + fruits);

        // 3. get(int index)
        // Retrieves the element at the specified index
        System.out.println("Element at index 2: "
                + fruits.get(2));

        // 4. set(int index, E element)
        // Replaces the element at the specified index
        fruits.set(2, "Grapes");

        System.out.println("After set(): " + fruits);

        // 5. remove(int index)
        // Removes the element at the specified index
        fruits.remove(1);

        System.out.println("After remove(index): " + fruits);

        // 6. indexOf(Object o)
        // Returns the index of the first occurrence
        System.out.println("First index of Banana: "
                + fruits.indexOf("Banana"));

        // 7. lastIndexOf(Object o)
        // Returns the index of the last occurrence
        System.out.println("Last index of Banana: "
                + fruits.lastIndexOf("Banana"));

        // 8. subList(int fromIndex, int toIndex)
        // Returns a portion of the list
        // from fromIndex (inclusive) to toIndex (exclusive)
        List<String> sub = fruits.subList(0, 2);

        System.out.println("SubList: " + sub);

        // 9. sort(Comparator<? super E> c)
        // Sorts the list in ascending alphabetical order
        fruits.sort(null);

        System.out.println("After sort(): " + fruits);
    }
}
