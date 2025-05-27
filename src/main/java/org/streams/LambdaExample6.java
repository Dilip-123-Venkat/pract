package org.streams;

import java.util.HashMap;
import java.util.Map;

public class LambdaExample6 {
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap<>();
        map.put("java",8);
        map.put("Spring",5);
        map.put("Lambda",1);
        map.forEach((key,value)-> System.out.println(key +" : "+value));
    }
}
