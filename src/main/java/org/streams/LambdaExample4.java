package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample4 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Spring", "Lambda", "Kafka");
        list.sort((s1,s2) -> s1.compareTo(s2));
        list.forEach(System.out::println);
    }
}
