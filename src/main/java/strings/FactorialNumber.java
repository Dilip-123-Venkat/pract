package strings;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int fact = scanner.nextInt();
        int factorial =1;
        for (int i =1; i<=fact; i++){
            factorial = factorial*i;

        }
        System.out.println(factorial);

    }
}
