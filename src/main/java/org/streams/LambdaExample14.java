package org.streams;

import java.util.function.Supplier;

public class LambdaExample14 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Java";
        System.out.println(supplier.get());
    }
}
