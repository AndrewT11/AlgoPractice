public class Practice {

    public static void main(String[] args) {
        //              0123456
        String roman = "MCMXCIV";
        System.out.println(romanToInt(roman));
    }
    public static int romanToInt(String s) {
        int sum = 0;
        int current = convert(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int next = convert(s.charAt(i));
            if (current < next) {
                sum -= current;
            } else {
                sum += current;
            }
            current = next;
        }
        sum += current;
        return sum;
    }

    private static int convert(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
