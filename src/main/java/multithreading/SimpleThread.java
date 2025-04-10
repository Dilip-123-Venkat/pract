package multithreading;

public class SimpleThread {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread t1 = new Thread(printer :: printNumber);
        Thread t2 = new Thread(printer :: printLetter);

        t1.start();
        t2.start();
    }
}
