package arrays;

public class Concat {

    public static String mergeAlternating(String s1,String s2){
        StringBuilder result = new StringBuilder();
        int i=0,j=0;
        while (i<s1.length() || j<s2.length()){
            if(i< s1.length()) result.append(s1.charAt(i++));
            if(j< s2.length()) result.append(s2.charAt(j++));

        }
        return result.toString();

    }
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Bye";

        String merged = mergeAlternating(s1, s2);
        System.out.println(merged);





    }

}

