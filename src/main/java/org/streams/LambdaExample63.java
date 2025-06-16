package org.streams;

import java.util.Arrays;

public class LambdaExample63 {
    public static void main(String[] args) {
        String[] array = {"Java", "Spring", "Lambda"};
        Arrays.sort(array, (s1, s2) -> s1.compareTo(s2));
        for (String s : array) {
            System.out.println(s);
    }
    }
}
