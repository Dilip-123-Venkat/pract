package arrays;

 class SimpleBinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9}; // Sorted array
        int target = 7;                 // Number to search for

        int left = 0;
        int right = numbers.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (numbers[mid] == target) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }
}

