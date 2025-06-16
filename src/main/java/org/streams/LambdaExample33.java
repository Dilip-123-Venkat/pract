package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample33 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double integer =numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(integer);
    }
}
