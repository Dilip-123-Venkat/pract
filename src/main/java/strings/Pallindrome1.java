package strings;

public class Pallindrome1 {
    public static void main(String[] args) {
        String input = "madam";
        String revered = new StringBuilder(input).reverse().toString();
        if (input.equals(revered)) {
            System.out.println(input + "is a pallindrome");
        }
        else {
            System.out.println(input + "is a pallindrome");
        }
        }
    }

