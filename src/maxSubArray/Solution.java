package maxSubArray;

public class Solution {
    public static int maxSubArray(int[] nums) {
        int maxSumSoFar = 0;
        int currentMaxSum = 0;

        for(int i = 1; i < nums.length; i++) {
            currentMaxSum = Math.max(nums[i], currentMaxSum + nums[i]);
            maxSumSoFar = Math.max(currentMaxSum, maxSumSoFar);
        }
        return maxSumSoFar;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(nums));
    }
}
