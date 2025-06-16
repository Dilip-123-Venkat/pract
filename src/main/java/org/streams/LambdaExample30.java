package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaExample30 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        Optional<String> first = list.stream()
                .findFirst();
        first.ifPresent(System.out::println);
    }
}
