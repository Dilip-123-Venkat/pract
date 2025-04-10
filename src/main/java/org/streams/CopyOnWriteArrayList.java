package org.streams;


import java.util.List;

public class CopyOnWriteArrayList {
    public static void main(String[] args) {
        List<String> shoppingList = new java.util.concurrent.CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Egg");
        shoppingList.add("Bread");
        System.out.println("Initial shopping list" + shoppingList);

        for (String item : shoppingList) {
            System.out.println(item);
            if (item.equals("egg")) {
           shoppingList.add("butter");
            }
        }
        System.out.println("Updated shopping List " + shoppingList);
    }
}