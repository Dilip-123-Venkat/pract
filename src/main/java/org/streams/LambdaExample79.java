package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample79 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        boolean collect = list.stream().allMatch(s->s.length()>3);
        System.out.println(collect);
    }
}
