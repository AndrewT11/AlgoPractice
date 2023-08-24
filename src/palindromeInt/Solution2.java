package palindromeInt;

public class Solution2 {

    public static void main(String[] args) {
        System.out.println(pali(121));

    }

    // This method will convert to string, then compare. This will be similar to the palindrome string.
    static boolean pali(int x) {
        String intToString = Integer.toString(x);

        int L = 0;
        int R = (intToString.length()-1); //should be 2, but registers as 3 for some reason.
        while (L < R) {
            char startChar = intToString.charAt(L); // we are assigning the character found at L, which is its index, to variable.
            char endChar = intToString.charAt(R); // assigning character found at R, which is its index, to variable.
            if (startChar != endChar) {
                return false;
            } else {
                L++;
                R--;
            }
        }
        return true;
    }
}
