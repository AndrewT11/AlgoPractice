package twosum;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Solution2 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 15, 11, 7};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
      int[] result = new int[2]; // The array that holds our results

      // HashMap that will hold the actual number sa the key, and the index as the value
      Map<Integer, Integer> map = new HashMap<>();
      // use for loop to iterate through the int array that holds our values to add to target
      for (int i = 0; i < nums.length; i++) {
          int difference = target - nums[i]; //creating the key that we need with the other key (nums[i]) to add up to target. At number 2, this is our only result. The map will not contain the number 7 yet. So we take 2 and use as the key for the index value of 0. Move onto index 1. 9 - 7 = 2. We check our map to see if the Hashmap contains 2. It does! That was our first put into the Hashmap. Thus, the if statement returns true, we put index i into the first index of our result array and we put the previous look up the different key and get its value for the second result. Remember, when we look up the Hashmap, we are looking up the value of numbers in the array. Those are the keys. The values are the indexes at which those numbers reside in the original nums array.

          if(map.containsKey(difference)) {
              result[0] = i;
              result[1] = map.get(difference);

          }
          map.put(nums[i], i);
      }
      return result;
    }

}
