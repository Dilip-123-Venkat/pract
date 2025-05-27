package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample3 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Java", "Spring", "JavaScript", "Python");
        List<String> filterdList = list.stream().filter(s->s.startsWith("J")).collect(Collectors.toList());
        filterdList.forEach(System.out::println);
    }
}