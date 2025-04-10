package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertAllStringsToUpperCase {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("dilip","vijeth","sachin");

        List<String> UpperCaseList = stringList.stream()
                                               .map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(UpperCaseList);
    }
}
