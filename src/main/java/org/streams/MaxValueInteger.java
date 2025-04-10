package org.streams;

import java.util.Arrays;
import java.util.List;

public class MaxValueInteger {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(22,33,44,55,66);

        int max = numbers.stream().mapToInt(Integer :: intValue).max().getAsInt();
        System.out.println(max);

        int min = numbers.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println(min);
    }
}
