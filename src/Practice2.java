import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Practice2 {

        public static void main(String[] args) {
            System.out.println(nPrimes(50));
        }

        public static String isPrime(int n) {
            for (int i = 2; i <n/2; i++) {
                if ( n % i == 0) {
                    System.out.println("Not a prime.");
                    return "Not prime";
                }
            }
            System.out.println("Is Prime.");
            return "Is Prime";
        }

        public static List<Integer> nPrimes(int n) {
            List<Integer> primeNumbers = new ArrayList<>();
            for (int i = 2; i <= n; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= i/2; j++) {
                    if( i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeNumbers.add(i);
                }
            }
            return primeNumbers;
        }
}
