package algorithms.src.RemoveKDigits;

import java.util.Stack;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        int charsLength = num.length() - k;
        char[] chars = new char[num.length()];
        int j = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            while (j > 0 && k > 0 && c < chars[j - 1]) {
                j--;
                k--;
            }
            chars[j] = c;
            j++;
        }

        int start = 0;
        for (int i = 0; i < charsLength; i++) {
            if (chars[i] != '0') {
                break;
            }
            start++;
        }

        StringBuilder result = new StringBuilder();
        for (int i = start; i < charsLength; i++) {
            result.append(chars[i]);
        }

        return result.length() == 0 ? "0" : result.toString();
    }
}
