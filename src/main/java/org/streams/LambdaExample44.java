package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample44 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","Spring","Lambda");
        String collect = list.stream().collect(Collectors.joining());
        System.out.println(collect);
    }
}
