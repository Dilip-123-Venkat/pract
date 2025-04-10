package strings;

public class StringNumber {

    public static void main(String[] args) {
        String str = "9490622190";
        StringBuilder sw = new StringBuilder(str);

//        1st way
        String A = "x".repeat(6) + sw.substring(6,10);
        System.out.println(A);

//        2nd way
//        for(int i=0; i<6; i++){
//            sw.setCharAt(i,'x');
//        }
//        System.out.println(sw);
    }
}
