package multithreading;

public class Printer {
    private int number = 1;
    private  char letter = 'a';

    public synchronized void printNumber(){
        for (int i = 1; i <= 26; i++){
            System.out.println(number++);
            notify();
            try {
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public synchronized void printLetter(){
        for (char c = 'a'; 'c'<'z'; c++){
            System.out.println(letter++);
            notify();
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
