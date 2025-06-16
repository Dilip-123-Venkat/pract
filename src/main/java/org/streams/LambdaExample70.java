package org.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExample70 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        String min = list.stream().min(Comparator.comparing(String::length)).orElse("No Min");
        System.out.println(min);
    }
}
