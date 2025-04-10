package collections;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    @Override
    void run() {
        super.run();
        System.out.println("Car is running smoothly");
    }
}

 class OverridingWithSuper {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();
    }
}
