package org.streams;

public class LambdaExample1 {
    public static void main(String[] args) {
        Runnable r =()-> System.out.println("hello lamda");
        new Thread(r).start();
    }
}
