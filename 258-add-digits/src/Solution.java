public class Solution {
    public static int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        int result = num;
        int temp = num;
        while (temp >= 10) {
            result = 0;
            while (temp > 0) {
                result += temp % 10;
                temp /= 10;
            }
            temp += result;
        }
        return result;
    }
}
