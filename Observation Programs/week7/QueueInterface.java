package basics;
import java.util.Queue;
import java.util.LinkedList;

public class QueueInterface {
    public static void main(String[] args) {

        Queue<String> students =
                new LinkedList<>();

        students.add("Manu");
        students.add("Anu");
        students.add("Ravi");
        students.add("Kiran");
        students.add("Priya");

        System.out.println("Queue: "
                + students);

        System.out.println("Head Element: "
                + students.peek());

        System.out.println("Removed Element: "
                + students.remove());

        System.out.println("Queue after remove: "
                + students);

        students.offer("Rahul");

        System.out.println("After offer Rahul: "
                + students);

        System.out.println("Head Element: "
                + students.element());

        System.out.println("Queue Size: "
                + students.size());

        System.out.println("\nProcessing Queue:");

        while (!students.isEmpty()) {

            System.out.println(
                    "Processing: " + students.poll());
        }

        System.out.println(
                "Queue after processing: "
                + students);

        System.out.println("Is Queue Empty: "
                + students.isEmpty());
    }
}

