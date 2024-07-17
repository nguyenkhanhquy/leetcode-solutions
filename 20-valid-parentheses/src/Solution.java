import java.util.HashMap;
import java.util.Stack;

public class Solution {
    static public boolean isValid(String s) {

        if (s.length() < 2) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')', '(');
        hashMap.put('}', '{');
        hashMap.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char charAtIndexI = s.charAt(i);

            if (charAtIndexI == '(' || charAtIndexI == '{' || charAtIndexI == '[') {
                stack.push(charAtIndexI);
            }
            else {
                if (stack.isEmpty() || hashMap.get(charAtIndexI) != stack.pop()) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
