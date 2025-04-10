package org.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSetIntegers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,4,6,2,1,2,2);
        Set<Integer> uniqueNumbers = numbers.stream().collect(Collectors.toSet());
        System.out.println("unique numbers :" + uniqueNumbers);

    }
}
