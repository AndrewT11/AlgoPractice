package voewlpresent;

public class Solution {
    public static void main(String[] args) {

        vowelPresent("Cow");
    }

    public static void vowelPresent(String s) {
        System.out.println(s.toLowerCase().matches("[aeiou].*"));
    }
}
