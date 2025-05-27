package collections;

import java.util.Arrays;

public class Arrayproblem {
    public static void main(String[] args) {
        int[] a = {2, 13, 24, 35, 46, 46, 46, 57, 69, 79};
        int key = 46;

        int[] ints = firstAndLastIndexOfArray(a, key);
        System.out.println(Arrays.toString(ints));
    }

    static int[] firstAndLastIndexOfArray(int[] a, int key) {
        int l = 0, h = a.length - 1;
        int[] res = {-1, -1};

        // First occurrence
        while (l <= h) {
            int mid = (l + h) / 2;
            if (key == a[mid]) {
                res[0] = mid;
                h = mid - 1;  // continue searching to the left
            } else if (key < a[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        // Last occurrence
        l = 0;
        h = a.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (key == a[mid]) {
                res[1] = mid;
                l = mid + 1;  // continue searching to the right
            } else if (key < a[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return res;
    }
}