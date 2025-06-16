package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample83 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Spring", "Lambda", "Stream");
        List<String> collect = list.stream().limit(2).collect(Collectors.toList());
        System.out.println(collect);
    }
}
