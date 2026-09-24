package record;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInter {

    public static void main(String[] args) {

        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // 1. add(E e)
        // Adds an element to the queue
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("After add(): " + queue);

        // 2. offer(E e)
        // Adds an element to the queue
        queue.offer("D");

        System.out.println("After offer(): " + queue);

        // 3. element()
        // Retrieves the first element without removing it
        // Throws an exception if the queue is empty
        System.out.println("Head using element(): "
                + queue.element());

        // 4. peek()
        // Retrieves the first element without removing it
        // Returns null if the queue is empty
        System.out.println("Head using peek(): "
                + queue.peek());

        // 5. remove()
        // Retrieves and removes the first element
        // Throws an exception if the queue is empty
        System.out.println("Removed using remove(): "
                + queue.remove());

        System.out.println("Queue after remove(): "
                + queue);

        // 6. poll()
        // Retrieves and removes the first element
        // Returns null if the queue is empty
        System.out.println("Removed using poll(): "
                + queue.poll());

        System.out.println("Queue after poll(): "
                + queue);
    }
}
