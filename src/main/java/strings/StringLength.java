package strings;

public class StringLength {
    public static void main(String[] args) {
        String str = "JavaProgramming";
        int length = 0;
//        System.out.println(str.length());
        for (int i = 0; i < str.length(); i++) {
            length++;
        }
        System.out.println("The length of the string:" + length);
    }
}
