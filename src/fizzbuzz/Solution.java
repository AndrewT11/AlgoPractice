package fizzbuzz;
import java.util.List;
import java.util.ArrayList;


public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> array = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if(i %3 == 0 && i%5 == 0) {
//                System.out.println("FizzBuzz");
                array.add("FizzBuzz");
            } else if ( i % 3 == 0) {
//                System.out.println("Fizz");
                array.add("Fizz");
            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
                array.add("Buzz");
            } else {
                array.add(Integer.toString(i));
//                System.out.println(i);
            }
        }
        return array;
//        return "Finished";
    }
}
