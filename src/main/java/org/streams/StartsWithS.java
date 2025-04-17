package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithS {

    public static void main(String[] args) {
        List<String> data = Arrays.asList("sai","dilip","super","venkat");
        List<String> s1 = data.stream().filter(s -> s.startsWith("s")).collect(Collectors.toList());
        System.out.println(s1);
    }
}
