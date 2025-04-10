package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatList {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(Arrays.asList("dilip","venkat"),Arrays.asList("talari","pkd"));

        List<String> flatList = nestedList.stream().flatMap(List :: stream).collect(Collectors.toList());
        System.out.println(flatList);
    }
}
