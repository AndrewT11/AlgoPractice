package reversedInt;


//Integer.parseInt(String)
public class Solution2 {
    public static void main(String[] args) {
        reversedInt(1567);
    }

    public static int reversedInt(int x) {
        String string = Integer.toString(x);
        StringBuilder reversed = new StringBuilder();

        for (int i = string.length()-1; i >= 0; i--) {
            reversed.append(string.charAt(i));
        }
        System.out.println(Integer.parseInt(String.valueOf(reversed)));
        return Integer.parseInt(String.valueOf(reversed));
    }
}
