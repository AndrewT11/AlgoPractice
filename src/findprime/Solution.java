package findprime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

//        System.out.println(nPrimes());
    }


    static List<Integer> primeNumbers = new ArrayList<>();
    public static List<Integer> allPrimes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the limit?");
        int limit = scanner.nextInt();

        for(int i=2; i <= limit; i++) {
           boolean isPrime = true;
           // We can use /2 for i in the limit because any number greater than half of the value will not divide evenly.
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
