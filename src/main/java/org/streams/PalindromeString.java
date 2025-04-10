package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("madam", "level", "racecar", "helllo");

        List<String> palindromes = words.stream()
                .filter(word -> word.equals(new StringBuilder(word).reverse().toString()))
                .collect(Collectors.toList());
        System.out.println(palindromes);

    }
}
