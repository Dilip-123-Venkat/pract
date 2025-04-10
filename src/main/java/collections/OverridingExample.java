package collections;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal d1 = new Dog();
        Animal c1 = new Cat();

        a1.makeSound();
        d1.makeSound();
        c1.makeSound();
    }
}
