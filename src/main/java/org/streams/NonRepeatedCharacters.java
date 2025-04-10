package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NonRepeatedCharacters {


    public static void main(String[] args) {

        String str = "JavaProgramming";

       List<Character> nonRepeatedChars = str.chars().mapToObj(c ->(char) c)
                       .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                       .entrySet().stream().filter(entry->entry.getValue()==1)
                       .map(Map.Entry::getKey).collect(Collectors.toList());


        System.out.println(nonRepeatedChars);


        List<String> stringList = Arrays.asList("Apple", "Banana", "Carrot");

        stringList.stream()
                //.map(String::toUpperCase)
//                .filter(z -> z.length() >5)
//                .map(x -> x.toLowerCase())
//                .forEach( System.out::println);
                .filter(z -> z.length() >5).map(String::toUpperCase).forEach(System.out::println);

    }
}
