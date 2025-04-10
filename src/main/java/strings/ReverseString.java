package strings;

public class ReverseString {
    public static void main(String[] args) {


        String input = "JavaProgramming";

        String reversed = reverseString(input);
        System.out.println("ReversedString :" + reversed);

    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();

    }
}
