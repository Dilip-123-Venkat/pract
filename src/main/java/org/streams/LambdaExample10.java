package org.streams;

import java.util.Optional;

public class LambdaExample10 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("java");
        optional.ifPresent(s -> System.out.println("value is present: " + s));
    }
}
