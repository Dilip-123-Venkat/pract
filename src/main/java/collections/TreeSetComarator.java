package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComarator {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new comparator());
        t.add("Dilip");
        t.add("Vishal");
        t.add("Venkat");
        t.add("Talari");
        System.out.println(t);
    }
}

class comparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String s1 = obj1.toString();
        String s2 = (String) obj2;
        return s2.compareTo(s1);
        //return -s1.compareTo(s2);
    }

}
