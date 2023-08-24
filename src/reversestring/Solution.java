package reversestring;

public class Solution {
    public static void main(String[] args) {
        solution("JimBoJones");
    }

    public static void solution(String s) {
        StringBuilder reverse = new StringBuilder();

        if (s.length() <= 0) {
            throw new IllegalArgumentException("There was no input.");
        }

        for (int i = s.length()-1; i >= 0; i--) {
            reverse.append(s.charAt(i));
        }
        System.out.println(reverse);
    }
}
