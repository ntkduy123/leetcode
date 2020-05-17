package algorithms.src.JewelsStones;

public class JewelsStones {
    public int numJewelsInStones(String J, String S) {
        boolean[] chars = new boolean[128];
        for (int i = 0; i < J.length(); i++) {
            chars[J.charAt(i)] = true;
        }

        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            result += chars[S.charAt(i)] ? 1 : 0;
        }

        return result;
    }
}
