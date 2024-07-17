import java.util.HashMap;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int temp = target - num;

            if (hashMap.containsKey(temp)) {
                return new int[]{hashMap.get(temp), i};
            }

            hashMap.put(num, i);
        }

        return new int[]{};
    }
}
