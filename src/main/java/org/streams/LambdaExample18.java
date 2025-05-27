package org.streams;

import java.util.function.Predicate;

public class LambdaExample18 {
    public static void main(String[] args) {

        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isEven.test(4));

        System.out.println(isEven.test(5));

    }
}
