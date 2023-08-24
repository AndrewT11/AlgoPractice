package swaptwonumbers;




public class Solution1 {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        swap2(a, b);
    }

    public static void swap(int a, int b) {
        System.out.println("Before a: " + a + "\nBefore b: " + b);
        b = b + a; // b = 5
        a = b - a; // a = 2
        b = b - a; // b = 3
        System.out.println("After swap a: " + a + "\nAfter swap b: " + b);

    }

    public static void swap2(int a, int b) {
        System.out.println("Before a: " + a + "\nBefore b: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap a: " + a + "\nAfter swap b: " + b);
    }




}
