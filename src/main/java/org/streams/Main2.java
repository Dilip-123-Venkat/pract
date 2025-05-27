package org.streams;


// ✅ Functional Interface with Lambda Expression
@FunctionalInterface
interface A {
    void add();
}

// ✅ Functional Interface with Inheritance — Valid Case
@FunctionalInterface
interface Parent {
    int getValue();
}

// ✅ Corrected Functional Interface by overriding the same method
@FunctionalInterface
interface Child extends Parent {
    @Override
    int getValue(); // ✅ Still only one abstract method
}

public class Main2 {
    public static void main(String[] args) {

        // ✅ Using Lambda Expression for Functional Interface A
        A obj = () -> System.out.println("Add Method calling");
        obj.add(); // Output: Add Method calling

        // ✅ Using Lambda Expression for Functional Interface Child
        Child child = () -> 42;
        System.out.println("Value from Child: " + child.getValue()); // Output: 42
    }
}

