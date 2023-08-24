package palindromeInt;

public class Solution {

    public static void main(String[] args) {
        System.out.println(palindrome(121));

    }

    public static boolean palindrome(int x) {
        if(x==0) {
            // 0 is a palindrome
            return true;
        }
        // negatives are not palindromes. Any number divided by 10 that return 0 remainder is a palindrome
        if(x < 0 || x % 10 == 0) {
            return false;
        }
        int original = x; //we need to use this as the value to compare to reversed. x will eventually be zero, so we cannot use x to compare.
        int pop; // the number is the remainder and will be added to the end of reversed to create the reversed string.
        int reversed = 0; // will eventually become the reversed number.

        while (x != 0) {
            pop = x % 10;
            x /= 10; // x is an integer, so it will not have any decimal places. If it was float, this would not work

            reversed = reversed*10 + pop;
            /*  reversed starts at 0, so the first *10 = 0 + pop (which was remainder from modulo
                As long as x has not been divided into 0, the while loop keeps running. we will grab the remainder of the
                number, divide x by 10, multiply reversed by 10 then add our remainder (pop) until we have divided x into
                oblivion.
             */
        }
        System.out.println("x = " + x);
        System.out.println("reversed = " + reversed);

        // Simple. If our original word = our reversed word, true. Else false.
        if (original == reversed) {
            return true;
        } else {
            return false;
        }
    }

}
