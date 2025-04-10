package org.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class HighestSalarySecond {
    public static void main(String[] args) {


        List<Integer> secondHighest = Arrays.asList(5000, 8000, 7000, 7000, 3000);

//    Integer secondSalary = secondHighest.stream().distinct()
//            .sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
//
//    System.out.println("2nd Highest Salary: "+secondSalary);
        Optional<Integer> min = secondHighest.stream().distinct().sorted(Comparator.reverseOrder()).limit(2).min(Integer::compareTo);
        if (min.isPresent()) {
            System.out.println(min.get());
        } else if (min.isEmpty()) {
            System.out.println("No Second Element");
        }

   // secondHighest.stream().limit(1).forEach(System.out::println);




    }

}
