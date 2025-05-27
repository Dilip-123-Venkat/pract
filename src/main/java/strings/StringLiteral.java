package strings;

public class StringLiteral {
    public static void main(String[] args) {


        String s1 = "March";
        String s2 = "March";
        String s3 = s1;

        s1 = "April";
        String newS3 = s3.concat(" May");

        System.out.println("s1 refers to -> " + s1);
        System.out.println("s2 refers to -> " + s2);
        System.out.println("s3 refers to -> " + s3);
        System.out.println("newS3 refers to -> " + newS3);
    }

}
