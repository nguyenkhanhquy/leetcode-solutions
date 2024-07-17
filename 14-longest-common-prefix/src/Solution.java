public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        if (strs[0].isEmpty()) {
            return "";
        }

        int index = 1;
        String prefix = "";
        while (!prefix.equals(strs[0])) {
            prefix = strs[0].substring(0, index);
            for (int i = 1; i < strs.length; i++) {
                if (!strs[i].startsWith(prefix)) {
                    return prefix.substring(0, prefix.length() - 1);
                }
            }
            index++;
        }

        return prefix;
    }
}