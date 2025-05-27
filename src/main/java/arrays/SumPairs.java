package arrays;

import java.util.HashSet;

public class SumPairs {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 9;

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int compliment = target - num;
            if (set.contains(compliment)) {
                System.out.println("(" + compliment + ", " + num + ")");

            }
            set.add(num);


        }
    }
}
