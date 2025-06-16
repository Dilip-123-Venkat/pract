package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample82 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Java", "Lambda");
        List<String> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
