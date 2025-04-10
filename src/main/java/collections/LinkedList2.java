package collections;

import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {

        LinkedList linkedList1 = new LinkedList();

        linkedList1.add("dilip");
        linkedList1.add(30);
        linkedList1.add(null);
        linkedList1.add("dilip");
        linkedList1.add(0,"software");
        linkedList1.add(0,"venkat");
        linkedList1.removeLast();
        linkedList1.addFirst("talari");
        System.out.println(linkedList1);

    }
}
