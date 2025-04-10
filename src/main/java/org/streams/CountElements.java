package org.streams;

import java.util.Arrays;
import java.util.List;

public class CountElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,11,23,34,6,9);
        long count = numbers.stream().filter(n-> n > 10).count();
        System.out.println("number of elements greater than 10 :" + count);
    }
}
