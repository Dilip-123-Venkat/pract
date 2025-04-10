package collections;

import java.util.ArrayList;


public class ArrayListOperations1 {
    public static void main(String[] args) {

        ArrayList l1 = new ArrayList();
        l1.add("A");
        l1.add(10);
        l1.add("A");
        l1.add(null);
        System.out.println(l1);
        l1.remove(2);
        System.out.println(l1);
        l1.add(2, "M");
        l1.add("N");
        System.out.println(l1);

    }
}