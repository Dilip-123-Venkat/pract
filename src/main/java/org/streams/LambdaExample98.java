package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaExample98 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        Optional<String> l = list.stream().filter(s -> s.startsWith("L")).map(String::toUpperCase).findFirst();
        l.ifPresent(System.out::println);
    }
}
