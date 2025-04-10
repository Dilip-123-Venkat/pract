package arrays;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int[] result = findMaxSubarraySum(arr);

        System.out.println("Maximum Subarray Sum: " + result[0]);
        System.out.print("Subarray: []");
        for (int i = result[1]; i <= result[2]; i++) {
            System.out.print(arr[i] + (i < result[2] ? ", " : ""));
        }
        System.out.println("[]");
    }

    public static int[] findMaxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        return new int[]{maxSum, start, end};
    }
}
