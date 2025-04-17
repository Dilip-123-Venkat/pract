package org.streams;

import java.util.Random;
import java.util.function.Supplier;

public class Between1to100 {
    public static void main(String[] args) {
        Supplier<Integer> randomSupplier =
        ()-> new Random().nextInt(100000) + 99999;

        int randomNumber =randomSupplier.get();
        System.out.println(randomNumber);
    }
}
