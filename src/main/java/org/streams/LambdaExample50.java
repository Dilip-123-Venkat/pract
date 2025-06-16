package org.streams;

import java.util.Optional;

public class LambdaExample50 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("java");
        optional.ifPresent(System.out::println);
    }
}

