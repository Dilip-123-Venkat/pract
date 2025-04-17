package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingStrings {
    public static void main(String[] args) {


    List<String> data = Arrays.asList("bat", "dog", "lion", "tiger");

        Map<Integer, List<String>> collect = data.stream().collect(Collectors.groupingBy(n -> n.length()));
        System.out.println(collect);

    }
}
