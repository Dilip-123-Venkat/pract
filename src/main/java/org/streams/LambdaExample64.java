package org.streams;

public class LambdaExample64 {
    public static void main(String[] args) {
        Runnable task1 = () -> System.out.println("Task 1 is running");
        Runnable task2 = () -> System.out.println("Task 2 is running");

        new Thread(task1).start();
        new Thread(task2).start();
    }
}
