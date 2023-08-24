package fibonacci;


import java.util.Scanner;

public class Solution2 {
    static long[] fibCache;
    public static long fibonacci(int n) {
        if ( n <= 1) {
            return n;
        }
        if(fibCache[n] != 0) {
            return fibCache[n];
        }

        long nthFibNum = fibonacci(n-1) + fibonacci(n-2);
        fibCache[n] = nthFibNum;

        return nthFibNum;
    }

    public static void main(String[] args) {
        System.out.println("What number would you like to find the fibonacci number of?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fibCache = new long[n+1];
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

}
