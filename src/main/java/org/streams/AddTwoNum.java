package org.streams;

import java.util.function.BiFunction;

public class AddTwoNum {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> collect = (i,j)->i+j;
        int i=3;
        int j=4;
        System.out.println(collect.apply(i,j));
    }
}
