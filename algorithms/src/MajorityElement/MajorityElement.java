package algorithms.src.MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(String S) {
        Map<Character, Integer> nVow = new HashMap<>();
        Map<Character, Integer> nCon = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            Character c = S.charAt(i);
            if (c == 'U' || c == 'A' || c == 'E' || c == 'I' || c == 'O') {
                nVow.put(c, nVow.getOrDefault(c, 0));
            } else {
                nCon.put(c, nCon.getOrDefault(c, 0));
            }
        }

        if (nVow.size() != (S.length() / 2)) return 0;
        if (nCon.size() != (int) (Math.ceil(S.length() / 2.0))) return 0;

        int fVow = factorial(nVow.size());
        for (int value : nVow.values()) {
            fVow /= factorial(value);
        }

        int fCon = factorial(nCon.size());
        for (int value : nCon.values()) {
            fCon /= factorial(value);
        }

        return fVow * fCon;
    }

    public int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
