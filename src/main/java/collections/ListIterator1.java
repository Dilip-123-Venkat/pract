package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("dilip");
        list.add("vijeth");
        list.add("venkat");
        list.add("sachin");
        System.out.println(list);
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            if (s.equals("vijeth")) {
                iterator.remove();
            } else if (s.equals("venkat")) {
                iterator.add("kohli");
            } else if (s.equals("sachin")) {
                iterator.set("virat");
            }
        }
        System.out.println(list);
    }
}
