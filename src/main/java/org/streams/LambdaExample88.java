package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample88 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        list.stream().forEachOrdered(System.out::println);
    }
}
