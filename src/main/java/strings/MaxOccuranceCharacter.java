package strings;

public class MaxOccuranceCharacter {
    public static void main(String[] args) {
        String str = "programming";

        int maxCount = 0;
        char maxChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }
            if (count > maxCount) {
             maxCount = count;
             maxChar = currentChar;
            }
        }
        System.out.println("Character with Maximum Occurance: "+ maxChar);
    }
    }
