package org.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExample69 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        String max = list.stream().max(Comparator.comparing(String::length)).orElse("No Max");
        System.out.println(max);
    }
}
