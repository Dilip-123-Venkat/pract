package org.streams;

import java.util.Arrays;
import java.util.List;

public class MethodReferanceInstance {

    public void printMessage(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        List<String> messages = Arrays.asList("java", "world" , "hello");

        MethodReferanceInstance obj = new MethodReferanceInstance();

       // messages.forEach(obj::printMessage);
        messages.forEach(  obj::printMessage);



    }
}
