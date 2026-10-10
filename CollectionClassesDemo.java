package basics;
import java.util.*;

public class CollectionClassesDemo {

    public static void main(String[] args) {

        // 1. ArrayList
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(20);
        al.add(30);
        al.add(1, 15);

        System.out.println("ArrayList: " + al);
        System.out.println("get(2): " + al.get(2));
        al.set(2, 25);
        System.out.println("After set: " + al);
        al.remove(1);
        System.out.println("After remove: " + al);
        System.out.println("Contains 20: " + al.contains(20));
        System.out.println("Size: " + al.size());
        System.out.println("Empty: " + al.isEmpty());
        System.out.println("Index of 20: " + al.indexOf(20));
        System.out.println("Last index of 20: " + al.lastIndexOf(20));
        al.sort(Comparator.naturalOrder());
        System.out.println("Sorted: " + al);


        // 2. LinkedList
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(20);
        ll.add(30);
        ll.addFirst(10);
        ll.addLast(40);

        System.out.println("\nLinkedList: " + ll);
        System.out.println("get(1): " + ll.get(1));
        System.out.println("getFirst: " + ll.getFirst());
        System.out.println("getLast: " + ll.getLast());

        ll.remove(1);
        System.out.println("After remove: " + ll);

        ll.removeFirst();
        ll.removeLast();

        ll.offer(50);
        System.out.println("After offer: " + ll);
        System.out.println("Poll: " + ll.poll());
        System.out.println("Peek: " + ll.peek());


        // 3. Vector
        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.addElement(30);

        System.out.println("\nVector: " + v);
        System.out.println("get(1): " + v.get(1));

        v.set(1, 25);
        v.remove(0);
        v.removeElement(30);

        System.out.println("After changes: " + v);
        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());
        System.out.println("Contains 25: " + v.contains(25));


        // 4. Stack
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\nStack: " + stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Empty: " + stack.empty());
        System.out.println("Search 10: " + stack.search(10));


        // 5. HashSet
        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(20);
        hs.add(30);

        System.out.println("\nHashSet: " + hs);
        System.out.println("Contains 20: " + hs.contains(20));
        System.out.println("Size: " + hs.size());
        System.out.println("Empty: " + hs.isEmpty());

        hs.remove(10);
        System.out.println("After remove: " + hs);


        // 6. LinkedHashSet
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(30);
        lhs.add(10);
        lhs.add(20);
        lhs.add(20);

        System.out.println("\nLinkedHashSet: " + lhs);
        System.out.println("Contains 20: " + lhs.contains(20));
        System.out.println("Size: " + lhs.size());

        lhs.remove(10);
        System.out.println("After remove: " + lhs);


        // 7. TreeSet
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(30);
        ts.add(10);
        ts.add(20);
        ts.add(40);
        ts.add(50);

        System.out.println("\nTreeSet: " + ts);
        System.out.println("First: " + ts.first());
        System.out.println("Last: " + ts.last());
        System.out.println("Higher 20: " + ts.higher(20));
        System.out.println("Lower 20: " + ts.lower(20));
        System.out.println("Ceiling 25: " + ts.ceiling(25));
        System.out.println("Floor 25: " + ts.floor(25));
        System.out.println("PollFirst: " + ts.pollFirst());
        System.out.println("PollLast: " + ts.pollLast());


        // 8. PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.offer(10);
        pq.add(20);

        System.out.println("\nPriorityQueue: " + pq);
        System.out.println("Peek: " + pq.peek());
        System.out.println("Poll: " + pq.poll());
        System.out.println("Contains 20: " + pq.contains(20));
        System.out.println("Size: " + pq.size());

        pq.remove(20);
        System.out.println("After remove: " + pq);


        // 9. ArrayDeque
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.addFirst(20);
        ad.addLast(30);
        ad.offerFirst(10);
        ad.offerLast(40);

        System.out.println("\nArrayDeque: " + ad);
        System.out.println("PeekFirst: " + ad.peekFirst());
        System.out.println("PeekLast: " + ad.peekLast());
        System.out.println("PollFirst: " + ad.pollFirst());
        System.out.println("PollLast: " + ad.pollLast());


        // 10. HashMap
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "Java");
        hm.put(2, "Python");
        hm.put(3, "C");

        System.out.println("\nHashMap: " + hm);
        System.out.println("Get 2: " + hm.get(2));
        System.out.println("Contains Key 1: " + hm.containsKey(1));
        System.out.println("Contains Value Java: "
                + hm.containsValue("Java"));
        System.out.println("KeySet: " + hm.keySet());
        System.out.println("Values: " + hm.values());
        System.out.println("EntrySet: " + hm.entrySet());
        System.out.println("Size: " + hm.size());
        System.out.println("Empty: " + hm.isEmpty());
        System.out.println("Default: "
                + hm.getOrDefault(5, "Not Found"));

        hm.remove(3);
        System.out.println("After remove: " + hm);


        // 11. LinkedHashMap
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

        lhm.put(1, "Java");
        lhm.put(2, "Python");
        lhm.put(3, "C");

        System.out.println("\nLinkedHashMap: " + lhm);
        System.out.println("Get 2: " + lhm.get(2));
        System.out.println("Contains Key 1: " + lhm.containsKey(1));
        System.out.println("KeySet: " + lhm.keySet());
        System.out.println("Values: " + lhm.values());
        System.out.println("EntrySet: " + lhm.entrySet());

        lhm.remove(3);
        System.out.println("After remove: " + lhm);


        // 12. TreeMap
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(30, "C");
        tm.put(10, "A");
        tm.put(20, "B");
        tm.put(40, "D");
        tm.put(50, "E");

        System.out.println("\nTreeMap: " + tm);
        System.out.println("Get 20: " + tm.get(20));
        System.out.println("Contains Key 20: " + tm.containsKey(20));
        System.out.println("Contains Value B: " + tm.containsValue("B"));
        System.out.println("FirstKey: " + tm.firstKey());
        System.out.println("LastKey: " + tm.lastKey());
        System.out.println("HigherKey 20: " + tm.higherKey(20));
        System.out.println("LowerKey 20: " + tm.lowerKey(20));
        System.out.println("CeilingKey 25: " + tm.ceilingKey(25));
        System.out.println("FloorKey 25: " + tm.floorKey(25));
        System.out.println("EntrySet: " + tm.entrySet());

        tm.remove(40);
        System.out.println("After remove: " + tm);


        // 13. Hashtable
        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1, "Java");
        ht.put(2, "Python");
        ht.put(3, "C");

        System.out.println("\nHashtable: " + ht);
        System.out.println("Get 2: " + ht.get(2));
        System.out.println("Contains Key 1: " + ht.containsKey(1));
        System.out.println("Contains Value Java: "
                + ht.containsValue("Java"));
        System.out.println("Size: " + ht.size());
        System.out.println("Empty: " + ht.isEmpty());

        System.out.print("Keys: ");
        Enumeration<Integer> keys = ht.keys();

        while (keys.hasMoreElements()) {
            System.out.print(keys.nextElement() + " ");
        }

        System.out.print("\nValues: ");
        Enumeration<String> values = ht.elements();

        while (values.hasMoreElements()) {
            System.out.print(values.nextElement() + " ");
        }

        ht.remove(3);
        System.out.println("\nAfter remove: " + ht);
    }
}