public class Solution {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int mid;
        int start = 1;
        int end = x;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (((long) mid * mid) == x) {
                return mid;
            }
            if (((long) mid * mid) < x) {
                start = mid + 1;
            }
            if (((long) mid * mid) > x) {
                end = mid - 1;
            }
        }
        return end;
    }
}
