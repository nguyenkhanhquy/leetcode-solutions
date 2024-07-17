public class Solution {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int n = nums.length;
        int tmp;
        for (int i = 0; i < n; i++) {
            if (nums[i] == val) {
                while (nums[n - 1] == val) {
                    n--;
                    if (n == 0) {
                        return k;
                    }
                }
                if (n == i) {
                    return k;
                }
                tmp = nums[i];
                nums[i] = nums[n - 1];
                nums[n - 1] = tmp;
            }
            k++;
        }
        return k;
    }
}
