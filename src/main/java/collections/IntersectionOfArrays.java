package collections;

import java.util.HashSet;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2 = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] result = intersection(nums1, nums2);
        System.out.println("intersection: ");


        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }
        return result;

    }
}