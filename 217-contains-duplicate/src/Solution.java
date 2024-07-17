import java.util.HashMap;

public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                return true;
            }
            hashMap.put(num, true);
        }
        return false;
    }
}
