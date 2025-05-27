package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCounter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Testing", "Tom", "Memeber", "Testing", "Tom1", "Member");

        Map<String, Long> collect = names.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        collect.entrySet().stream().filter(entry ->entry.getValue() >1)
                .forEach(entry -> System.out.println(entry.getKey()+" "+ entry.getValue()));
    }
}
