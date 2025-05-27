package arrays;

public class SimpleLinearSearch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 9, 4, 6};
        int start = 0;
        int end = numbers.length - 1;
        int target = 4;

        for (int i = 0; i < numbers.length - 1; i++) {
            int mid = start + (end - start) / 2;
            if (numbers[i] == target) {
                System.out.println("Element at index: " + i);
            } else if (numbers[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

    }

}
