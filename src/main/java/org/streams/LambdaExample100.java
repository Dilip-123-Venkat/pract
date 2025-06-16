package org.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExample100 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        String not_found = list.stream().min(Comparator.comparingInt(String::length)).orElse("not found");
        System.out.println(not_found);
    }
}
