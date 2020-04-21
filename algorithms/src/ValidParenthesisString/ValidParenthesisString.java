package algorithms.src.ValidParenthesisString;

import java.util.Stack;

public class ValidParenthesisString {
    public boolean checkValidString(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '*') {
                count = count + 1;
            } else {
                count = count - 1;
            }

            if (count < 0) return false;
        }

        if (count == 0) return true;

        count = 0;
        for (int i = s.length()-1; i>=0; i--) {
            if (s.charAt(i) == ')' || s.charAt(i) == '*') {
                count = count + 1;
            } else {
                count = count - 1;
            }

            if (count < 0) return false;
        }

        return true;
    }
}
