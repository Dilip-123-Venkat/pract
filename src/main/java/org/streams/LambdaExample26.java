package org.streams;

import java.util.Arrays;
import java.util.List;

public class LambdaExample26 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        long count = list.stream().count();
        System.out.println(count);
    }
}
