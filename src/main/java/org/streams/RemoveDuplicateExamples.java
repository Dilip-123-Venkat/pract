package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateExamples {
    public static void main(String[] args) {
        //removing the duplicate elements from the list
        // given list of integers
        List<Integer> numbers = Arrays.asList(1,2,3,3,4,5,5,6,7);
        List<Integer> list = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(list);

        //given list of strings
        List<String> fruits = Arrays.asList("orange","apple","banana","orange");
        List<String> list2 = fruits.stream().distinct().collect(Collectors.toList());
        System.out.println(list2);
    }
}
