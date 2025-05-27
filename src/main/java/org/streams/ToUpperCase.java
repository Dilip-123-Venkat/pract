package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("dilip", "venkat","desh");

        List<String> collect = names.stream()
                .filter(name -> name.startsWith("d"))
                .map(String::toUpperCase)
                .sorted().collect(Collectors.toList());
        System.out.println(collect);
    }
}
