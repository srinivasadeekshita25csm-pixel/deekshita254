package basics;
import java.util.Deque;
import java.util.ArrayDeque;

public class DequeInterface {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Java");
        deque.addLast("Python");
        deque.addFirst("C");
        deque.addLast("C++");

        System.out.println("Deque: " + deque);

        System.out.println("First Element: "
                + deque.peekFirst());

        System.out.println("Last Element: "
                + deque.peekLast());

        deque.offerFirst("HTML");
        deque.offerLast("CSS");

        System.out.println("After offer operations: "
                + deque);

        deque.removeFirst();

        System.out.println("After removeFirst: "
                + deque);

        deque.removeLast();

        System.out.println("After removeLast: "
                + deque);

        System.out.println("First Element: "
                + deque.getFirst());

        System.out.println("Last Element: "
                + deque.getLast());

        System.out.println("Size: "
                + deque.size());

        System.out.println("\nUsing for-each:");

        for (String item : deque) {
            System.out.println(item);
        }
    }
}
