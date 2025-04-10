package org.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Teeing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Map<String, Double> result = numbers.stream()
                .collect(Collectors.teeing(
                        Collectors.summingDouble(n -> n),
                        Collectors.averagingDouble(n -> n),
                        (sum, avg) -> Map.of("Sum", sum, "Average", avg)
                ));

        System.out.println(result);
    }
}
