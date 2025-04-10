package org.streams;

import java.util.Arrays;
import java.util.List;

public class CountTheStrings {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Anantapur", "anna","amani","Venkat","Dilip");

        long A = data.stream().filter(s -> s.toUpperCase().startsWith("A")).count();
        System.out.println(A);

    }
}
