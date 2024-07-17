import java.util.HashMap;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int num;
        int tmp;
        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
            tmp = target - num;

            if (hashMap.containsKey(tmp)) {
                return new int[]{hashMap.get(tmp), i};
            }

            hashMap.put(num, i);
        }

        return new int[]{};
    }
}
