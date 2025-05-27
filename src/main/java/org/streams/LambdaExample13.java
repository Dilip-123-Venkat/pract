package org.streams;

import java.util.function.Consumer;

public class LambdaExample13 {
    public static void main(String[] args) {
        Consumer<String> print = s -> System.out.println(s);
        print.accept("hello world!");
    }
}
