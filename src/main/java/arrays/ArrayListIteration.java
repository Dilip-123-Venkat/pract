package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteration {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> arr = new ArrayList<>();
        arr.add("Apple");
        arr.add("Banana");
        arr.add("Cherry");
        arr.add("Date");

        // 1. Using a for loop (Index-based)
        System.out.println("Using for loop:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        // 2. Using enhanced for loop (for-each)
        System.out.println("\nUsing enhanced for loop:");
        for (String fruit : arr) {
            System.out.println(fruit);
        }

        // 3. Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = arr.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 4. Using Stream API (Java 8+)
        System.out.println("\nUsing Stream API:");
        arr.stream().forEach(System.out::println);
    }
}
