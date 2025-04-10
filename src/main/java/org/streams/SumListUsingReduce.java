package org.streams;

import java.util.Arrays;
import java.util.List;

public class SumListUsingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int sum = numbers.stream().reduce(0, (a,b) -> a+b);

        System.out.println("The sum of list : " + sum);
    }
}
