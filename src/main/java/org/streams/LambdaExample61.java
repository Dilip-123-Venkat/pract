package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample61 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Pear", "Apple", "Banana");
        list.sort((s1, s2) -> s1.compareTo(s2));
        list.forEach(System.out::println);
    }
}
