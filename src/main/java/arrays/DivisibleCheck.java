package arrays;


 class DivisibleCheck {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i + " is divisible by 3 or 5");
            } else {
                System.out.println(i + " is not divisible by 3 or 5");
            }
        }
    }
}

