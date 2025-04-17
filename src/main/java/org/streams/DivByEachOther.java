package org.streams;

import java.util.function.BiPredicate;

public class DivByEachOther {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isDivisible = (a, b) -> b != 0 &&  a%b == 0;
        int num1 = 20;
        int num2 = 5;
//        if (isDivisible.test(num1, num2)) {
//            System.out.println(num1 + "isDivisible by " + num2);
//        } else
//            System.out.println("isNotDivisible");
//    }
        System.out.println(isDivisible.test(num1, num2));
    }
}
