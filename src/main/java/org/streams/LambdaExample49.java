package org.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExample49 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java", "Spring", "Lambda", "Kafka");
        stream.peek(System.out::println).collect(Collectors.toList());
    }
}
