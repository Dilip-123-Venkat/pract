package strings;

import java.util.Scanner;

public class StringContainsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the main String (quit or exit the program)");
            String mainString = scanner.nextLine();

            if (mainString.equalsIgnoreCase("exit")) {
                System.out.println("exiting the program.");
                break;
            }

            System.out.println("Enter the sub String to check");
            String subString = scanner.nextLine();

            if (mainString.contains(subString)) {
                System.out.println("The main string contains the sub string");
            } else {
                System.out.println("The main String does not contains the sub string");
            }
        }
        scanner.close();
    }
}
