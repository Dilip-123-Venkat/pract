package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample80 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        boolean collect = list.stream().noneMatch(s->s.startsWith("z"));
        System.out.println(collect);
    }
}
