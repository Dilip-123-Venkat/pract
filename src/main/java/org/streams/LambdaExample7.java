package org.streams;

public class LambdaExample7 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Thread with Lambda!")).start();
    }
}
