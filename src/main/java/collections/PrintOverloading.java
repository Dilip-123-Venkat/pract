package collections;

public class PrintOverloading {
        public void print(int value){
            System.out.println("printing int "+ value);
    }
    public void print(String value){
            System.out.println("printing String "+value);
    }
    public void print(double value) {
        System.out.println("Printing double: " + value);
    }

    public void print(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        System.out.println("value");
    }
}
