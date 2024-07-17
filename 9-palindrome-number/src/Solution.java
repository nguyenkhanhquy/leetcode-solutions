public class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        } else if (x < 10) {
            return true;
        }

        int original = x;
        int reversed = 0;
        int digit;

        while (x != 0) {
            digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return reversed == original;
    }
}
