package longestCommonPrefix;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] wordArray = new String[]{"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(wordArray));;
    }


//    Example 1:
//
//    Input: strs = ["flower","flow","flight"]
//    Output: "fl"
//    Example 2:
//
//    Input: strs = ["dog","racecar","car"]
//    Output: ""
//    Explanation: There is no common prefix among the input strings.

    // we will be using indexOf() method here.
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                System.out.println(strs[i].indexOf(prefix));
                prefix = prefix.substring(0, prefix.length()-1); // this will continually create a shorter prefix to match
            }
        }
        return prefix;
    }
}
/* Situation. We have a base case that if there is noting in the array, we will immediately return an empty string
   We create a prefix variable and make it equal to the first word. Our plan is to take one letter off of the first word
   until the prefix of the fist word matches the second word. Then, we will compare the new prefix with the third word in the array,
   once again removing a letter until the prefix variable is reduced to matching to the prefix of word 3.
   We can use indexOf to match a certain portion of a word or string. This will return the index. If there is nothing matching,
   -1 will be returned instead of the matching index.
   If there is no match, we will reduce the length of the prefix by using .substring and decrementing the length of prefix in the second argument,
   thus reducing the length of the prefix itself.

 */