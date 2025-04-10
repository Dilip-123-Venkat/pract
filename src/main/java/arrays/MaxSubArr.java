package arrays;

class MaxSubArr {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaxSubArr arr1 = new MaxSubArr();
        int i = arr1.maxSubArray(arr);
        System.out.println(i);
    }

    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max_sum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max_sum) {

                max_sum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max_sum;
    }
}