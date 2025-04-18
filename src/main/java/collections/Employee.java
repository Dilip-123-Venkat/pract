package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Employee implements Comparable {
    String name;
    int eid;

    public Employee(String name, int eid) {
        this.eid = eid;
        this.name = name;
    }

    public String toString() {
        return name + "__" + eid;
    }

    @Override
    public int compareTo(Object obj) {
        int eid1 = this.eid;
        Employee e = (Employee) obj;
        int eid2 = e.eid;
        if (eid1 < eid2) {
            return -1;
        } else if (eid1 < eid2) {
            return +1;
        } else return 0;
    }
}

class CompComp {
    public static void main(String[] args) {
        Employee e1 = new Employee("Dilip", 10);
        Employee e2 = new Employee("Vijeth", 60);
        Employee e3 = new Employee("Venkat", 30);
        Employee e4 = new Employee("Talari", 50);

        TreeSet t = new TreeSet();

        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);

        System.out.println(t);

        TreeSet t1 = new TreeSet(new Mycomparator());


        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);

        System.out.println(t1);
    }
}

class Mycomparator implements Comparator {

    public int compare(Object obj1, Object obj2) {
        Employee e1 = (Employee) obj1;
        Employee e2 = (Employee) obj2;
        String s1 = e1.name;
        String s2 = e2.name;
        return s1.compareTo(s2);
    }
}
