package org.streams;


@FunctionalInterface
interface MyFunctionalInterface2{
    int  myMethod(int a,int b);
}
public class LambdaExample59 {
    public static void main(String[] args) {
        MyFunctionalInterface2 add =(a,b)->(a+b);
        System.out.println(add.myMethod(5,3));
    }
}
