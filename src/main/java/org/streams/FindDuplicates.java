package org.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1, 2, 3, 2, 3, 4, 4, 4);
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int i :data){
            if (!seen.add(i)){
                duplicates.add(i);
            }
        }
        System.out.println(duplicates);

    }
}
