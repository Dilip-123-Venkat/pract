package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample25 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana", "Apple", "Pear", "Grapes");
        list.stream().sorted().forEach(System.out::println);
    }
}