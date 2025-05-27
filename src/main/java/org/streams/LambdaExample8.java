package org.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExample8 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Spring", "Lambda", "Kafka");

        list.sort(Comparator.comparingInt(String::length));
        list.forEach(System.out::println);
    }
}
