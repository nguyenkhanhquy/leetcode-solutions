public class Solution {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                break;
            }
            if (i == 0) {
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = 1;
                for (int j = 1; j <= digits.length; j++) {
                    newDigits[j] = digits[j - 1];
                }
                return newDigits;
            }
        }
        return digits;
    }
}
