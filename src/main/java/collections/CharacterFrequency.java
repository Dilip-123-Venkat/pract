package collections;


import java.util.HashMap;

class CharacterFrequency {
    public static void main(String[] args) {
        String str = "Programming";
        HashMap<Character,Integer> frequencyMap = countCharacterFrequency(str);
        System.out.println(frequencyMap);
    }
    public static HashMap<Character,Integer> countCharacterFrequency(String str) {
        HashMap<Character,Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
        map.put(c, map.getOrDefault(c,0) +1);
        }
        return map;
    }
}
