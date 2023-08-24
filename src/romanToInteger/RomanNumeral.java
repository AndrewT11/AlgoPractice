package romanToInteger;

public class RomanNumeral {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    private static int convert(char c) {
        switch(c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    private static int romanToInt(String s) {
        int sum = 0;
        int currentNum = convert(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int next = convert(s.charAt(i));
            if (currentNum < next) {
                sum -= currentNum;
            } else {
                sum += currentNum;
            }

            currentNum = next;
        }

        sum += currentNum;
        return sum;
    }
}
