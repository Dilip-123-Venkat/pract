package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample62 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        list.forEach(s -> System.out.println(s));
    }
}
