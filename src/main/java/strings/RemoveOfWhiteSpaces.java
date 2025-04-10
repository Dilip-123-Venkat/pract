package strings;

public class RemoveOfWhiteSpaces {
    public static void main(String[] args) {
        String inputString = "hello world java programming";

        String outputString = inputString.replaceAll(" ","");

        System.out.println(outputString);
    }

}
