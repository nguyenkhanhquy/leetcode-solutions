public class Solution {
    public static boolean isPalindrome(String s) {
        String filteredString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedString = new StringBuilder(filteredString).reverse().toString();
        return filteredString.equals(reversedString);
    }
}
