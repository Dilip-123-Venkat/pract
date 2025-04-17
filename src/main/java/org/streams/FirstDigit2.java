package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstDigit2 {
    public static void main(String[] args) {


        List<Integer> input = Arrays.asList(23, 22, 54, 11, 65, 2, 200);

        List<Integer> output = input.stream()
                .map(number -> {
                    String firstDigit = Integer.toString(number).substring(0, 1);

                    if (firstDigit.equals("2")) {
                        return number + 50;
                    } else {
                        return number;
                    }
                })
                .collect(Collectors.toList());

        System.out.println(output);


    }
}
