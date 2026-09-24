package record;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInter {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        students.add("Ravi");
        students.add("Sita");
        students.add("Arun");
        students.add("Priya");

        ListIterator<String> itr = students.listIterator();

        // hasNext() and next()
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // hasPrevious() and previous()
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }

        // nextIndex() and previousIndex()
        System.out.println("Next Index: " + itr.nextIndex());
        System.out.println("Previous Index: " + itr.previousIndex());

        // add()
        itr.add("Kiran");
        System.out.println("After add(): " + students);

        // next()
        itr.next();

        // set()
        itr.set("Rahul");
        System.out.println("After set(): " + students);

        // remove()
        itr.remove();
        System.out.println("After remove(): " + students);
    }
}
