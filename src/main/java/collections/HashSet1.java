package collections;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add("B");
        h.add("D");
        h.add("C");
        h.add(null);
        h.add(10);
        System.out.println(h.add("D"));
        System.out.println(h);
    }
}
