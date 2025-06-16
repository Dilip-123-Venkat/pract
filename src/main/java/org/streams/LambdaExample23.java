package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample23 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
