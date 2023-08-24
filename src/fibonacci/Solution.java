package fibonacci;

// This is the basic beginner solution. As n gets larger, the time to complete the algo also grows. n = 50 took about a minute.
public class Solution {

    static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return (fibonacci(n - 1) + fibonacci(n - 2));
    }

    public static void main(String[] args) {

        int n = 25;
        System.out.println(fibonacci(n));
    }
}


