package maxSubArray;

public class Solution {
    public static int maxSubArray(int[] nums) {
        int maxSumSoFar = nums[0];
        int currentMaxSum = nums[0];

        // Math.max compares the two numbers within the arguments and returns the highest value.
        for(int i = 1; i < nums.length; i++) {
            currentMaxSum = Math.max(nums[i], currentMaxSum + nums[i]);
            maxSumSoFar = Math.max(currentMaxSum, maxSumSoFar);
        }
        return maxSumSoFar;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 3, 4, -5, 1};

        System.out.println(maxSubArray(nums));
    }
}
