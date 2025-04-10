package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class StringRemoveDuplicate {
    public static void main(String[] args) {
        String str = "helZlo";
        char[] c = str.toCharArray();

//        LinkedHashSet<Character> a = new LinkedHashSet<>();
//        for (char n : c) {
//            a.add(n);
//
//        }
//        for (char m : a) {
//            System.out.print(m+ " ");
//        }

        TreeSet<Character> characters = new TreeSet<>();
        for (char c1:c) {
            characters.add(c1);

        }

//        ArrayList<Character> characters1 = new ArrayList<>(characters);
//        Collections.sort(characters1);
        System.out.println(characters);
    }
}
