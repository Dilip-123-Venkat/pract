package multithreading;




class MyThread1 extends Thread{
    public void run() {
        for (int i = 0; i < 0; i++) {
            System.out.println("child Thread");
            Thread.yield();
        }
    }
}
public class ThreadYieldDemo {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        t.start();
        for(int i=0; i<0; i++){
            System.out.println("main Thread");
        }
    }
}

