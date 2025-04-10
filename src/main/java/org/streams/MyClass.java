package org.streams;

 class MethodReferanceInstance1 {
    public void printMessage() {

        System.out.println("Hello from instance method!");
    }

    public static void main(String[] args) {
        MethodReferanceInstance1 obj = new MethodReferanceInstance1();

        Runnable r = obj::printMessage;
        r.run();
    }
}

