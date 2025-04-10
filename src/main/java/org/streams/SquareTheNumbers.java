package org.streams;

import java.util.*;
import java.util.stream.Collectors;

public class SquareTheNumbers {
    public static void main(String[] args) {


        List<Integer> data = Arrays.asList(1,2,3,7,9,4,6,9,4);
        List<Integer> collect = data.stream()
                .map(n->n*n)
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);


    }

    public static class GreaterThanHundred {
        public static void main(String[] args) {
            List<Integer> data = Arrays.asList(102,405,12,34,56,708);
            List<Integer> collect = data.stream().filter(n -> n > 100).sorted(Comparator.reverseOrder())
                    .limit(3).collect(Collectors.toList());
            System.out.println(collect);
        }
    }
}
