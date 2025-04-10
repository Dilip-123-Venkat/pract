package strings;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();
        if(input.equals(reversed)){
            System.out.println(input + "It is a Pallindrome");
        }
        else {
            System.out.println(input + "it is not a Pallindrome");
        }
        scanner.close();
    }
}
