package strings;


public class Reverse {
    public static void main(String[] args) {

        String str = "dilip";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i) + " ");
        }
    }

}
