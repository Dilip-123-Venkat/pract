package collections;

import java.util.Stack;

public class StackList {
    public static void main(String[] args) {

        Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("C");


        System.out.println(s);
        System.out.println(s.search("A"));
        System.out.println(s.search("Z"));
    }
}
