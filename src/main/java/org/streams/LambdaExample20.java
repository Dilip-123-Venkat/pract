package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample20 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "spring", "lambda");
        List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
    }
}
