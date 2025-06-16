package org.streams;

import java.util.stream.Stream;

public class LambdaExample48 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java", "Spring", "Lambda", "Kafka");
        stream.skip(2).forEach(System.out::println);
    }
}
