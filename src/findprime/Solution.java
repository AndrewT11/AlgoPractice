package findprime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

//        prime(13);
        System.out.println(nPrimes());
    }

    public static String prime(int n) {
        for(int i = 1; i <= n; i++) {
           if (50 % n == 0) {
               System.out.println("Not a prime.");
               return "Not a prime";
           }

        }
        System.out.println("Is a prime.");
        return "is a prime";
    }

    static List<Integer> primeNumbers = new ArrayList<>();
    public static List<Integer> allPrimes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the limit?");
        int limit = scanner.nextInt();

        for(int i=2; i <= limit; i++) {
           boolean isPrime = true;
            for(int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    static List<Integer> nPrimeNums = new ArrayList<>();

    public static List<Integer> nPrimes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the limit?");
        int limit = scanner.nextInt();
        int numberToCheck = 2;
        int count = 0;
        while(true) {

            boolean isPrime = true;
            for(int j = 2; j <= numberToCheck/2; j++) {
                if (numberToCheck % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                nPrimeNums.add(numberToCheck);
                count++;
                if(count >= limit) {
                    break;
                }
            }
            numberToCheck++;
        }
        return nPrimeNums;
    }
}
