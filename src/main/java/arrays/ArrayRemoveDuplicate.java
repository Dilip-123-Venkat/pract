package arrays;

import java.util.TreeSet;

public class ArrayRemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 9, 4, 6, 2};
        TreeSet<Integer> integers = new TreeSet<>();
        for (int n : arr){
            integers.add(n);
        }
        System.out.println(integers);

    }
}


