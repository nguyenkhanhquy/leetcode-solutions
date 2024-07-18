public class Solution {
    public static int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
        int cur = 0;
        int prev1 = 3;
        int prev2 = 2;
        for (int i = 3; i < n; i++) {
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }
        return cur;
    }
}
