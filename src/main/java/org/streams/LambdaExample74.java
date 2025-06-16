package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaExample74 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda", "Stream");
        Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length));
        collect.forEach((k,v)-> System.out.println(k+":"+v));
    }
}
