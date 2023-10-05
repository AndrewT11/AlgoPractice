package removeDupsFromSortedArray;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] arg) {
        int[] nums = new int[]{0, 0,1, 1, 2, 2, 3, 3, 3, 4, 4};

        System.out.println(removeDuplicates(nums));
    }
}
