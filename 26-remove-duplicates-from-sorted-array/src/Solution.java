public class Solution {
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        int tmp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (tmp != nums[i]) {
                nums[k] = nums[i];
                tmp = nums[i];
                k++;
            }
        }
        return k;
    }
}
