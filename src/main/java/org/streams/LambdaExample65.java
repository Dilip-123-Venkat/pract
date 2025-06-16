package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample65 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        String result = list.stream()
                .reduce("", (a, b) -> a + b);
        System.out.println(result);

    }
}
