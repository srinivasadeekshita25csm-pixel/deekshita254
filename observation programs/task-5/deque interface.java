package record;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInter {

    public static void main(String[] args) {

        // Create a Deque using ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // 1. addFirst(E e)
        // Adds an element at the front of the deque
        deque.addFirst("B");
        deque.addFirst("A");

        System.out.println("After addFirst(): " + deque);

        // 2. offerFirst(E e)
        // Adds an element at the front
        // Returns false if insertion fails
        deque.offerFirst("Start");

        System.out.println("After offerFirst(): " + deque);


        // 3. peekFirst()
        // Retrieves the first element without removing it
        // Returns null if the deque is empty
        System.out.println("First element using peekFirst(): "
                + deque.peekFirst());

        // 4.. removeFirst()
        // Retrieves and removes the first element
        // Throws an exception if the deque is empty
        System.out.println("Removed using removeFirst(): "
                + deque.removeFirst());

        System.out.println("Deque after removeFirst(): "
                + deque);


        // 5. pollFirst()
        // Retrieves and removes the first element
        // Returns null if the deque is empty
        System.out.println("Removed using pollFirst(): "
                + deque.pollFirst());

        System.out.println("Deque after pollFirst(): "
                + deque);

       
    }
}
