package org.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestStream {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1,2,6,9,4);
        List<Integer> collect = data.stream().sorted(Comparator.reverseOrder())
                .limit(2).skip(1).collect(Collectors.toList());
        System.out.println(collect);
    }
}
