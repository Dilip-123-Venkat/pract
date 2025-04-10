package collections;

import java.util.HashMap;

class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        System.out.println("Apple: " + map.get("Apple"));
        System.out.println("Banana: " + map.get("Banana"));

        if (map.containsKey("Orange")) {
            System.out.println("Orange is present");
        }

        map.remove("Banana");

        System.out.println("Map: " + map);
    }
}
