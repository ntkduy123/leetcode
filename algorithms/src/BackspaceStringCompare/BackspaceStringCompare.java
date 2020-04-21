package algorithms.src.BackspaceStringCompare;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1;
        int nBackspace1 = 0, nBackspace2 = 0;
        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (S.charAt(i) == '#') {
                    nBackspace1++;
                    i--;
                } else if (nBackspace1 > 0) {
                    nBackspace1--;
                    i--;
                } else {
                    break;
                }
            }

            while (j >= 0) {
                if (T.charAt(j) == '#') {
                    nBackspace2++;
                    j--;
                } else if (nBackspace2 > 0) {
                    nBackspace2--;
                    j--;
                } else {
                    break;
                }
            }

            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j)) {
                return false;
            } else if ((i >= 0 && j < 0) || (j >= 0 && i < 0)) {
                return false;
            } else {
                i--;
                j--;
            }
        }
        return true;
    }
}
