package basics;
import java.util.Set;
import java.util.HashSet;

public class SetInterface {
    public static void main(String[] args) {

        Set<Integer> numbers =
                new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Set: "
                + numbers);

        System.out.println("Size: "
                + numbers.size());

        System.out.println("Contains 20: "
                + numbers.contains(20));

        numbers.remove(10);

        System.out.println("After removing 10: "
                + numbers);

        Set<Integer> extra =
                new HashSet<>();

        extra.add(50);
        extra.add(60);

        numbers.addAll(extra);

        System.out.println("After addAll: "
                + numbers);

        System.out.println("\nUsing for-each:");

        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("\nContains 50: "
                + numbers.contains(50));

        System.out.println("Is Empty: "
                + numbers.isEmpty());

        numbers.clear();

        System.out.println("After clear: "
                + numbers);

        System.out.println("Is Empty Now: "
                + numbers.isEmpty());
    }
}


