package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample84 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda", "Stream");
        List<String> skippedList = list.stream().skip(2).collect(Collectors.toList());
        skippedList.forEach(System.out::println);
    }
}
