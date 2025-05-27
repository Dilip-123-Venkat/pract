package strings;

public class StringUpperCase {
    public static void main(String[] args) {


        String s = "Kavithaa";
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c)
                    count++;
            }

            if (count > 1) {
                res += Character.toUpperCase(c);
            } else {
                res += Character.toLowerCase(c);
            }
        }
        System.out.println("Modified String is:" + res);
    }

}