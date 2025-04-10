package collections;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        char result = firstNonRepeatingChar(str);
        System.out.println("First non-repeating character: " + result);
    }

    public static char firstNonRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }

        return '-';
    }
}
