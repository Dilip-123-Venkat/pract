// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
package strings;
import java.util.*;
public class GroupedAnagram
{
    public static void main(String[] args) {

        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> grouped =groupAnagram(strs);

 		System.out.println(grouped);

    }

    public static List<List<String>> groupAnagram(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String word :strs) {
            char [] chars =word.toCharArray();
            Arrays.sort(chars);


            String sorted = new String(chars);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(word);
        }
        return new ArrayList<>(map.values());
    }
}