package arrays;

public class Reversearray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 8};
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }

    }
}

