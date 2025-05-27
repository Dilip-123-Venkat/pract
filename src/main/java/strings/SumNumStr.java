package strings;


public class SumNumStr {
    public static void main(String[] args) {
        String input = "GSD#13xxU343%^DGF1@@";

        String numStr = "";
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                numStr += ch; // Build number
            } else {
                if (!numStr.isEmpty()) {
                    sum += Integer.parseInt(numStr); // Add complete number
                    numStr = ""; // Reset
                }
            }
        }

        // Add last number if any
        if (!numStr.isEmpty()) {
            sum += Integer.parseInt(numStr);
        }

        System.out.println("Sum: " + sum);
    }
}