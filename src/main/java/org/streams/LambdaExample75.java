package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample75 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        long count = list.stream().map(String::toUpperCase).count();
        System.out.println("Count: " + count);
    }
}
