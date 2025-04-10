package collections;

class ConstructOverloadingExample {
    String name;
    int age;

    ConstructOverloadingExample(String n) {
        name = n;
        age = 0;
    }

    ConstructOverloadingExample(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + (age == 0 ? "Not provided" : age));
    }

    public static void main(String[] args) {
        ConstructOverloadingExample s1 = new ConstructOverloadingExample("Alice");
        ConstructOverloadingExample s2 = new ConstructOverloadingExample("Bob", 20);

        s1.display();
        s2.display();
    }
}

