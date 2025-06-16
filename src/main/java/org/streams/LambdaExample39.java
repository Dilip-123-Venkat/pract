package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaExample39 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Spring", "Lambda", "Java");
        Map<String,Long> frequency = list.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
        frequency.forEach((k,v)-> System.out.println("k :"+ v));
    }
}
