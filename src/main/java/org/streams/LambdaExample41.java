package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample41 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        Long collect = list.stream().collect(Collectors.counting());
        System.out.println("Count: "+ collect);
    }
}
