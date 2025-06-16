package org.streams;

import java.util.Optional;

public class LambdaExample56 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java");
        optional.flatMap(s -> Optional.of(s.toUpperCase())).ifPresent(System.out::println);
    }
}
