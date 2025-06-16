package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample76 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        String first = list.stream().filter(s->s.startsWith("S")).findFirst().orElse("not found");
        System.out.println(first);
    }
}
