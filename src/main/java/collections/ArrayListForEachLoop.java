package collections;

import java.util.ArrayList;

public class ArrayListForEachLoop {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        System.out.println("fruits in arraylist");
        for (String fruit : fruits) {
            System.out.println(fruit);

        }

    }
}
