package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CombinedArrayList {

    //    by using streams
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(34, 6, 73),
                Arrays.asList(45, 7, 3),
                Arrays.asList(1, 2));
//        List<Integer> collect = listOfLists.stream().flatMap(L -> L.stream()).sorted().collect(Collectors.toList());
//        System.out.println(collect);
//

//    by using collections
        ArrayList<Integer> list = new ArrayList<>();
       for (int i = 0 ; i<listOfLists.size();i++){
           list.addAll(listOfLists.get(i));

       }
        Collections.sort(list);
        System.out.println(list);

    }
}
