package arrays;

import java.util.HashSet;

public class ArrayRemoveDuplicate1 {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'd', 'r', 'a', 'b'};
        HashSet<Character> obj1 = new HashSet<>();
        for (char c : arr) {
            obj1.add(c);

        }
        System.out.println(obj1);

    }
}
