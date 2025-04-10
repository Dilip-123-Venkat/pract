package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,34,5,23,45,56,42,64);
        List<Integer> evenNumbers = numbers.stream().filter(n->n % 2 ==0).collect(Collectors.toList());
        System.out.println("EvenNumbers :" + evenNumbers);
    }
}
