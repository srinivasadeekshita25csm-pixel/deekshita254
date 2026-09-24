package record;

import java.util.HashMap;
import java.util.Map;

public class MapInter {

    public static void main(String[] args) {

        // Create a Map using HashMap
        Map<Integer, String> students = new HashMap<>();

        // 1. put(K key, V value)
        // Adds key-value pairs to the map
        students.put(101, "Ravi");
        students.put(102, "Sita");
        students.put(103, "Arun");
        students.put(104, "Priya");

        System.out.println("After put(): " + students);

        // 2. get(Object key)
        // Retrieves the value associated with the given key
        System.out.println("Student with key 102: "
                + students.get(102));

        // 3. remove(Object key)
        // Removes the key-value pair associated with the key
        students.remove(103);

        System.out.println("After remove(103): " + students);

        // 4. containsKey(Object key)
        // Checks whether the specified key exists
        System.out.println("Contains key 101: "
                + students.containsKey(101));

        // 5. containsValue(Object value)
        // Checks whether the specified value exists
        System.out.println("Contains value Sita: "
                + students.containsValue("Sita"));

        // 6. keySet()
        // Returns all keys as a Set
        System.out.println("Keys: "
                + students.keySet());

        // 7. values()
        // Returns all values as a Collection
        System.out.println("Values: "
                + students.values());

        // 8. entrySet()
        // Returns all key-value pairs
        System.out.println("Key-Value pairs: "
                + students.entrySet());

        // 9. size()
        // Returns the number of key-value mappings
        System.out.println("Size of Map: "
                + students.size());

        // 10. isEmpty()
        // Checks whether the map is empty
        System.out.println("Is Map empty: "
                + students.isEmpty());

        // 11. clear()
        // Removes all key-value pairs from the map
        students.clear();

        System.out.println("After clear(): "
                + students);

        // Check whether the map is empty after clear()
        System.out.println("Is Map empty after clear(): "
                + students.isEmpty());
    }
}
