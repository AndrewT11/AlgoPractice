package containsDuplicate;

import java.util.Arrays;

public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,1,1,3,3,4,3,2,4,2};
        int[] array2 = new int[]{1,2,3,4};

        System.out.println(containsDuplicate(array2));
    }
}
