package org.streams;

public class StringDemo {
    public static void main(String[] args) {


        String s = "'task's'";
        StringBuilder sb = new StringBuilder(s);

        // By String Builder
        if (sb.charAt(0) == 39 && sb.charAt(sb.length() - 1) == 39) {
//            sb.deleteCharAt(sb.length() - 1); // remove last '
//            sb.deleteCharAt(0);               // remove first '
            sb.setCharAt(0,' ');
            sb.setCharAt(sb.length()-1, ' ');
        }


        System.out.println(sb);
    }
}

