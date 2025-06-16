package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample78 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        boolean collect = list.stream().anyMatch(s->s.startsWith("S"));
        System.out.println(collect);
    }
}
