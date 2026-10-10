package basics;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorInterface {
    public static void main(String[] args) {

        ArrayList<String> languages =
                new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        languages.add("C++");
        languages.add("JavaScript");

        ListIterator<String> iterator =
                languages.listIterator();

        System.out.println("Forward Direction:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nBackward Direction:");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        iterator = languages.listIterator();

        while (iterator.hasNext()) {

            String language = iterator.next();

            if (language.equals("C")) {
                iterator.set("C Programming");
            }
        }

        System.out.println("\nAfter Updating C:");

        System.out.println(languages);

        iterator = languages.listIterator();

        while (iterator.hasNext()) {

            String language = iterator.next();

            if (language.equals("JavaScript")) {
                iterator.add("HTML");
            }
        }

        System.out.println("\nAfter Adding HTML:");

        System.out.println(languages);

        System.out.println("\nFinal List:");

        for (String language : languages) {
            System.out.println(language);
        }
    }
}

