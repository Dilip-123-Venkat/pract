package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("dilip","venkat","amit");
        List<String> collect = data.stream().map(s -> s.toUpperCase()).sorted().collect(Collectors.toList());
        System.out.println(collect);

    }
}
