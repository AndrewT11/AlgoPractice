package mergeStringsAlternately;

public class Solution {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";

        System.out.println(mergeStrings(word1, word2));
    }


    public static String mergeStrings(String word1, String word2) {
        StringBuilder combinedString = new StringBuilder();

        for(int i = 0; i < word1.length() || i < word2.length(); i++ ) {
            if (i < word1.length()) {
                combinedString.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                combinedString.append(word2.charAt(i));
            }
                System.out.println(combinedString);
        }
        return combinedString.toString();
    }
}
