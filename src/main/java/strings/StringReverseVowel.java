package strings;


public class StringReverseVowel {
    public static void main(String[] args) {
        String s = "helloui";//hilluoe
        //eoui ->iuoe

        char[] ch = s.toCharArray();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                s2.append(ch[i]);
            }
        }
        s2.reverse();

        // i will add reverse in chararray
        int j = 0;

        // Step 3: Replace vowels in original array with reversed ones
        for (int i = 0; i < ch.length; i++) {
            if (isVowel(ch[i])) {
                ch[i] = s2.charAt(j++);
            }
        }
        // Output final string
        System.out.println(new String(ch));

    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }


}
