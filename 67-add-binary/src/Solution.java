public class Solution {
    public static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            return addBinary(b, a);
        }
        int n = a.length() - b.length();
        for (int i = 0; i < n; i++) {
            b = "0" + b;
        }
        String sum = "";
        boolean carry = false;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (!carry) {
                if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                    sum = "0" + sum;
                    carry = true;
                } else if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                    sum = "0" + sum;
                } else {
                    sum = "1" + sum;
                }
            } else {
                if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                    sum = "1" + sum;
                } else if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                    sum = "1" + sum;
                    carry = false;
                } else {
                    sum = "0" + sum;
                }
            }
        }
        if (carry) {
            sum = "1" + sum;
        }
        return sum;
    }
}
