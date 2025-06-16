package org.streams;

import java.util.Optional;

public class LambdaExample54 {
    public static void main(String[] args) {
        Optional<String> optional =Optional.of("java");
        Optional<Integer> length = optional.map(String::length);
        length.ifPresent(System.out::println);

    }
}
