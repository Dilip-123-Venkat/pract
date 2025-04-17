package org.streams;

import java.util.Arrays;
import java.util.List;

public class EvenNumberSum {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1,2,4,5);
        Integer reduce = data.stream().filter(n -> n % 2 == 0).reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
    }
}
