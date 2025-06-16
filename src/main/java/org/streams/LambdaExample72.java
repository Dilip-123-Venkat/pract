package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample72 {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Java", "Spring"),
                Arrays.asList("Lambda", "Stream")
        );

        List<String> flatList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
        flatList.forEach(System.out::println);
    }
}
