package arrays;

public class DescendingSortingArray {
    public static void main(String[] args) {
        int[] num = {4, 3, 9, 8, 6};
        desc(num, num.length, 0);
        for (int a : num) {
            System.out.print(a + " ");
        }


    }

    public static void desc(int[] num, int n, int i) {
        if (n == 1) {
            return;
        }
        if (i == n - 1) {
            desc(num, n - 1, 0);
            return;

        }

        if (num[i] < num[i + 1]) {
            num[i] = num[i] + num[i + 1];
            num[i + 1] = num[i] - num[i + 1];
            num[i] = num[i] - num[i + 1];

        }
        desc(num, n, i + 1);
    }
}
