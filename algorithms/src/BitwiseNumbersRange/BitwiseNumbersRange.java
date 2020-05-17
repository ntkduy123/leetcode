package algorithms.src.BitwiseNumbersRange;

public class BitwiseNumbersRange {
    public int rangeBitwiseAnd(int m, int n) {
        int move = 0;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            ++move;
        }
        return n << move;
    }
}
