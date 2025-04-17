package org.streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {


        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect = data.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);


    }
}
