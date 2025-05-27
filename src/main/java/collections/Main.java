package collections;

import java.util.HashMap;
import java.util.Map;

class A {
    public int hashCode() {
        return 0;
    }

    public boolean equals(Object o) {
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Map<A, Integer> map = new HashMap<>();
        A a1 = new A();
        A a2 = new A();
        A a3 = a2;

        map.put(a1, 1);
        map.put(a2, 2);
        map.put(a3, 3);
        map.put(new A(), 4);

        System.out.println(map.get(a1));
        System.out.println(map.get(a2));
        System.out.println(map.get(a3));
        System.out.println(map.get(new A()));
    }
}
