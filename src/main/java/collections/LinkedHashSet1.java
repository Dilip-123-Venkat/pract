package collections;


import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet h = new LinkedHashSet();
        h.add("B");
        h.add("D");
        h.add("C");
        h.add(null);
        h.add(10);
        System.out.println(h.add("D"));
        System.out.println(h);
    }
}
