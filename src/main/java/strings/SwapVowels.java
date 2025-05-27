package strings;

public class SwapVowels {
    public static void main(String[] args) {
        String input = "Hello";
        System.out.println("Original String : " + input);
        System.out.println("Swapped Vowels: " + swapVowels(input));
    }
    public static String swapVowels(String str){
        char[] chars = str.toCharArray();
        int left = 0;
        int right = str.length()-1;

        while (left<right){
            while (left<right && !isVowel(chars[left])) left++;
            while (left<right && !isVowel(chars[right])) right--;

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left ++;
            right --;
        }
        return new String(chars);
    }
    private static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;

    }
}
