package strings;

import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String");
        String input = scanner.nextLine();

        int vowels = 0;
        int consonants = 0;

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
                
            }

        }
        System.out.println("vowels: "+ vowels);
        System.out.println(("consonants: "+ consonants));


    }
}
