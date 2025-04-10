package collections;

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Banana");
        list2.add("apple");
        list2.add("orange");
        list2.add("pineapple");
        System.out.println("Arraylist"+list2);
        list2.remove(2);
        System.out.println("ArrayList"+ list2);
        list2.remove("Banana");
        System.out.println("Arraylist after removing "+ list2);
    }
}
