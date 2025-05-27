package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample9 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Spring", "Lambda", "Kafka");

        list.forEach(System.out::println);
    }
}
