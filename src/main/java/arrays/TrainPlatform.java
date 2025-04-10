package arrays;

import java.util.Scanner;


public class TrainPlatform {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Arrival Train Count");
        int arrivalTrain = scanner.nextInt();
        System.out.println("Departure Train Count");

        int departureTrain = scanner.nextInt();
        int[] train1 = new int[arrivalTrain];
        int[] train2 = new int[departureTrain];

        int n = train1.length;
        int m = train2.length;
        System.out.println("Total No of Platform : ");
        int totalPlatform = scanner.nextInt();

        if (n + m <= totalPlatform) {
            System.out.println("No need to increase platform");
        } else {
            int PlatformNeeded = Math.abs(totalPlatform - n - m);
            System.out.println(PlatformNeeded + " More Platform Needed");
        }

    }
}

