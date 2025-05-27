package arrays;

import java.util.*;


class NearlyLucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of inputs
        int nearlyLuckyCount = 0;

        for (int i = 0; i < n; i++) {
            String number = sc.next(); // Read each number as string
            int luckyDigitCount = 0;

            for (char ch : number.toCharArray()) {
                if (ch == '4' || ch == '7') {
                    luckyDigitCount++;
                }
            }

            // Check if luckyDigitCount is 4 or 7
            if (luckyDigitCount == 4 || luckyDigitCount == 7) {
                nearlyLuckyCount++;
            }
        }

        System.out.println(nearlyLuckyCount);
    }
}
