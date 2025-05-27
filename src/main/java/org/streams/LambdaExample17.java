package org.streams;

import java.util.function.BinaryOperator;

public class LambdaExample17 {
    public static void main(String[] args) {
        BinaryOperator<Integer>multiply =(a,b)->a+b;
        System.out.println(multiply.apply(3,4));
    }
}
