package multithreading;

public class DaemonThread {
    public static void main(String[] args) {
        Thread daemon = new Thread(() -> System.out.println("Daemon thread running"+Thread.currentThread().getName()));
        daemon.setDaemon(true);

        Thread user = new Thread(() -> System.out.println("User thread running"+Thread.currentThread().getName()));


        user.start();
        daemon.start();
    }
}
