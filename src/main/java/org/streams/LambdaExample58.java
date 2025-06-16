package org.streams;

@FunctionalInterface
interface MyFunctionalInterface1 {
    void myMethod(String s);
}

public class LambdaExample58 {
    public static void main(String[] args) {
        MyFunctionalInterface1 myFunc = (s) -> System.out.println(s);
        myFunc.myMethod("Hello,Java");

    }
}
