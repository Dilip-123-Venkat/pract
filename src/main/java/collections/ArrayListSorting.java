package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);
        System.out.println("before sitting " + numbers);

        Collections.sort(numbers);
        System.out.println("after sitting " + numbers);

    }
}
