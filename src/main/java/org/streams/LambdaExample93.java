package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample93 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "", "Spring", "Lambda", "");
        List<String> collect = list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
