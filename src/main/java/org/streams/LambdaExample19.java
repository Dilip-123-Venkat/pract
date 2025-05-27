package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample19 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple","Banana","Pear");
        list.sort((s1,s2)->s2.compareTo(s1));
        list.forEach(System.out::println);
    }
}
