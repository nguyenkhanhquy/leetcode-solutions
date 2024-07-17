public class Solution {
    public static int lengthOfLastWord(String s) {
        int result = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return result;
            }
            result++;
        }
        return result;
    }
}
