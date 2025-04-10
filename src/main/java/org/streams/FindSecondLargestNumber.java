package org.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,35,50,50,65,75);
          int secondLargest = numbers.stream()
                                     .distinct()
                                     .sorted(Comparator.reverseOrder())
                                     .skip(1)
                                     .findFirst()
                                     .get();
        System.out.println(secondLargest);
    }
}
