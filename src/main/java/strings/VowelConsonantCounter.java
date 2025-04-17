package strings;

import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String");
        String input = scanner.nextLine();
        String s = input.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;

            }

        }
        System.out.println("vowels: " + vowels);
        System.out.println(("consonants: " + consonants));


    }
}
