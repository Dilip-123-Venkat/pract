package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample29 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        boolean nonePython = list.stream()
                .noneMatch(s -> s.equals("Python"));
        System.out.println("Contains no 'Python': " + nonePython);
    }
}
