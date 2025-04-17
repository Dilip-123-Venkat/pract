package collections;

public class CalculatorOverloading {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method with different order of parameters
    public String add(String s, int a) {
        return s + a;
    }
}
