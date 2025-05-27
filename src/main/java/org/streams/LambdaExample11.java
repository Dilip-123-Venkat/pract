package org.streams;

import java.util.function.Predicate;

public class LambdaExample11 {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s-> s.isEmpty();
        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test("java"));
    }
}
