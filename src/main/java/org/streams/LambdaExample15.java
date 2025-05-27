package org.streams;

import java.util.function.Function;

public class LambdaExample15 {
    public static void main(String[] args) {
        Function<String, Integer> length = s -> s.length();
        System.out.println(length.apply("Lambda"));
    }
}
