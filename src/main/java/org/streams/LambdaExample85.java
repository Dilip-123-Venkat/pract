package org.streams;

import java.util.stream.Stream;

public class LambdaExample85 {
    public static void main(String[] args) {
        Stream.generate(()->"java").limit(3).forEach(System.out::println);
    }
}
