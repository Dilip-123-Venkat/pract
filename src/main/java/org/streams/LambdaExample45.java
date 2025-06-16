package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaExample45 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        Map<String, Integer> collect = list.stream().collect(Collectors.toMap(s -> s, String::length));
        System.out.println(collect);
    }
}
