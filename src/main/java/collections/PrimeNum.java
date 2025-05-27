package collections;


import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int startingPoint = s.nextInt();
        int EndPoint = s.nextInt();
        int total = 0;
        for (int i = startingPoint; i <= EndPoint; i++) {
            if (isPrime(i)) {
                total++;
                System.out.print(i + " ");
            }
        }
        System.out.println("Total Prime Numbers " + total);


    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;


    }


}