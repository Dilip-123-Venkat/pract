package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample27 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        boolean containsJava = list.stream().anyMatch(s->s.equals("java"));
        System.out.println("ContainsJava: " +containsJava);
    }
}
