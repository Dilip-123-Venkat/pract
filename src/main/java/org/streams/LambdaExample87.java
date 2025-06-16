package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample87 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");

        List<String> unmodifiableList = list.stream().collect(Collectors.collectingAndThen(Collectors.toList(),
                collected->List.copyOf(collected)));
        unmodifiableList.forEach(System.out::println);
    }
}
