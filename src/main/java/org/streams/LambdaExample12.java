package org.streams;

import java.util.function.BiFunction;

class LambdaExample12 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> add =(a,b)->a+b;
        System.out.println(add.apply(2,3));
    }
}
