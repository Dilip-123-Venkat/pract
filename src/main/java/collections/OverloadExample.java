package collections;

public class OverloadExample {

    void display(int a){
        System.out.println("Integer value: " + a);
    }
    void display(int a, int b){
        System.out.println("Integer values: " + a + ", " + b);
    }
    void display(String str){
        System.out.println("String value: " + str);
    }
    public static void main(String[] args) {
        OverloadExample example = new OverloadExample();
        example.display(10);
        example.display(10, 20);
        example.display("Hello World");

    }
}
