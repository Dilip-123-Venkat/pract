package org.streams;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyChar {
    public static void main(String[] args) {
        String s = "Banana";
        Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect);

    }
}
