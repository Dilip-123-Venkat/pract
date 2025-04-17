package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLength {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "bat", "ball");

        List<Integer> collect = input.stream().map(n -> n.length()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
