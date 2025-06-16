package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LambdaExample91 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Spring", "Java", "Lambda");

        Set<String> collect = list.stream().collect(Collectors.toSet());

        collect.forEach(System.out::println);
    }
}
