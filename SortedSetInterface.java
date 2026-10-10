package basics;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {
    public static void main(String[] args) {

        SortedSet<Integer> marks =
                new TreeSet<>();

        marks.add(85);
        marks.add(65);
        marks.add(95);
        marks.add(75);
        marks.add(55);
        marks.add(85);

        System.out.println("Sorted Marks: "
                + marks);

        System.out.println("First Mark: "
                + marks.first());

        System.out.println("Last Mark: "
                + marks.last());

        System.out.println("Size: "
                + marks.size());

        System.out.println("Head Set: "
                + marks.headSet(85));

        System.out.println("Tail Set: "
                + marks.tailSet(75));

        System.out.println("Sub Set: "
                + marks.subSet(65, 95));

        System.out.println("\nMarks using for-each:");

        for (Integer mark : marks) {
            System.out.println(mark);
        }

        System.out.println("\nContains 75: "
                + marks.contains(75));

        marks.remove(55);

        System.out.println("After removing 55: "
                + marks);

        System.out.println("First Mark After Removal: "
                + marks.first());

        System.out.println("Last Mark After Removal: "
                + marks.last());
    }
}
