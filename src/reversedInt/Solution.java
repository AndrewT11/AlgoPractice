package reversedInt;

public class Solution {

    public static void main(String[] args) {

        System.out.println(reverse(355555555));
    }

    public static int reverse(int x) {
        int pop; // will hold the modulo value we will add to reversed
        int reversed = 0; // the sum of the pop integers after an algo

        while(x != 0) { // we use this while loop because we will keep dividing x until it becomes zero.
            pop = x % 10; // will return the remainder, which is 3, the lsat digit
            x/=10; // We do this to make x decrease by a factor of 10, removing the last digit.

            if (reversed > Integer.MAX_VALUE/10 || reversed < Integer.MIN_VALUE/10) {
                return 0;
            }

            reversed = reversed*10 + pop; // first run, reversed is 0. 0 * 10 = 0, + pop, which is 3.

            // After 3, we run again as x is now 12. 2 will become pop. x will again move down a factor of 10, becoming 1 at this point.
            // reversed is multipled by 10, which now equals 30 and adds 2. We now have 32.
            // x is still not 0. x is now 1. We divide 1 by 10, leaving a remainder of one. Pop is now 1.
            // we divide x by 10 and x is now officially zero and once we run the loop, the loop will end.
            //we will multiple reverse again by 10. It is now 320. We add pop, which is 1, to it. We now have reversed as 321.
            //Loop ends, we return reversed.

        }
        return reversed;
    }
}
