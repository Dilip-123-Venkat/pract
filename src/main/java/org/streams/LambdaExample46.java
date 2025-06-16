package org.streams;

import java.util.stream.Stream;

public class LambdaExample46 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java", "Spring", "Lambda");
        stream.forEach(System.out::print);
    }
}
