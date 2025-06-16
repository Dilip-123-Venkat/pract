package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaExample97 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring");
        Map<Integer, String> collect = list.stream().collect(Collectors.toMap(String::length, s -> s));
        collect.forEach((k,v)-> System.out.println(k+":"+v));
    }
}
