package org.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateIndexsRemove {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(2,3,4,2,3,4);
        List<Integer> collect = data.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
