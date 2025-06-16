package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample35 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(Integer.MAX_VALUE);
        System.out.println(min);
    }
}
