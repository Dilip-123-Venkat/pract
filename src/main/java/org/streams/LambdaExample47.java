package org.streams;

import java.util.stream.Stream;

public class LambdaExample47 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java", "Spring", "Lambda", "Kafka");
        stream.limit(2).forEach(System.out::println);
    }
}
