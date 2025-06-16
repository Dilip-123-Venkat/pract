package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaExample31 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","Spring","Lambda");
        Optional<String> any = list.stream().findAny();
        any.ifPresent(System.out::println);
    }
}
