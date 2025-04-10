package arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SortingValues {
    public static void main(String[] args) {
        String str = "dilip@123";
        char[] c = str.toCharArray();
//        TreeSet<Character> obj1 = new TreeSet<>();
        LinkedHashSet<Character> obj1 = new LinkedHashSet<>();
//        HashSet<Character> obj1 = new HashSet<>();
        for (char c1 : c) {
            obj1.add(c1);

        }
        System.out.println(obj1);

    }
}
