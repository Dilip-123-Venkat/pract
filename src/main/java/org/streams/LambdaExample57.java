package org.streams;



@FunctionalInterface

interface MyFunctionalInterface {

    void myMethod();

}
public class LambdaExample57 {
    public static void main(String[] args) {
        MyFunctionalInterface myFunc = () -> System.out.println("My Method Implemantation");
        myFunc.myMethod();
    }
}
