package org.streams;

import java.util.Optional;

public class LambdaExample55 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java");

        optional.filter(s -> s.equals("Java")).ifPresent(System.out::println);
    }
}
