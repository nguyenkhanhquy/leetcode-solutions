public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int index;
        int mid = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;
                return index;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        if (nums[mid] < target) {
            index = mid + 1;
        } else {
            index = mid;
        }
        return index;
    }
}
