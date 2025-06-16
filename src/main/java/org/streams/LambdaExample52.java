package org.streams;

import java.util.Optional;

public class LambdaExample52 {
    public static void main(String[] args) {

        Optional<String> optional = Optional.ofNullable(null);
        String value = optional.orElseGet(() -> "Default");
        System.out.println(value);
}
}
