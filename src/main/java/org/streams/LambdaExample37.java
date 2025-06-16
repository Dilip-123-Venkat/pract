package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample37 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","Spring","Lambda");
        list.stream().mapToInt(String::length).forEach(System.out::print);
    }
}
