package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "is", "awesome");

        String sentence = words.stream().collect(Collectors.joining(" "));
        System.out.println(sentence);
    }
}
