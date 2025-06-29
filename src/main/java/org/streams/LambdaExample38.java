package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LambdaExample38 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda", "Spring");

        Set<String> set = list.stream()
                .collect(Collectors.toSet());
        set.forEach(System.out::println);

    }
}
