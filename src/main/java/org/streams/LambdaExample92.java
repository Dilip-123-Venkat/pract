package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample92 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Java", "Lambda");
        long count = list.stream().distinct().count();
        System.out.println("count :" + count);
    }
}
