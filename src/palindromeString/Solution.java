package palindromeString;
import java.lang.Character;

public class Solution {
    public static void main(String[] args) {
        String word = "racecar";
        String word2 = "bubblebutt";
        String word3 = "A man, a plan, a canal: Panama";
        System.out.println(pali(word3));

    }
    //Methods used: Character.isLetterOrDigit() and Character.toLowerCase();
    static boolean pali(String word) {
        int L = 0;
        int R = word.length() -1;

        char startChar = word.charAt(L);
        char endChar = word.charAt(R);

        while(L < R) {
            /* this is the most confusing part of this algo. isLetterOrDigit checks if the char in question is a letter or
                digit. If it is not a digit, we skip over it immediately. we chec kth eleft side first, then the right side.
                This will take care of any symbols or whitespace.
             */

            if (!Character.isLetterOrDigit(startChar)) {
                L++;
            } else if (!Character.isLetterOrDigit(endChar)) {
                R--;
            } else {
                /*
                    Now we do the same thing as we did with our palindromeInt that was converted into a string. But,
                    we must take care of any upper case letters, thus we use Character.toLowerCase() method to convert to
                    lower case.
                 */
                if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                    return false;
                } else {
                    L++;
                    R--;
                }
            }
        }
        return true;
    }
}
