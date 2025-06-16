package org.streams;

public class LambdaExample60 {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("task is running");
        new Thread(task).start();
    }
}
