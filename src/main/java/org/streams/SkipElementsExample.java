package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipElementsExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,33,44,6,7,8,9);

        List<Integer> result = numbers.stream().skip(2).collect(Collectors.toList());
        System.out.println(result);
    }
}
