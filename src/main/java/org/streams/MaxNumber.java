package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1,2,3,7,9,4,6,9,4);
        List<Integer> collect = data.stream().sorted().collect(Collectors.toList());
        System.out.println(collect.get(0)+" "+ collect.get(collect.size()-1));

    }
}
