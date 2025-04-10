package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,9,6,3,7);

        List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted list in ascending order :" + sortedList);
    }
}
