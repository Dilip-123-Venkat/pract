package strings;

public class OccurrenceOfCharacters {
    public static void main(String[] args) {

        String str = "JavaProgramming";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
             int count = 0;

         for(int j = 0; j<str.length(); j++){
             if(str.charAt(j) == currentChar){
                 count ++;
             }
         }
            System.out.println(currentChar + ": "+ count);
        }
    }
}
