package algorithms.src.KthSymbolGrammar;

import java.util.HashMap;
import java.util.Map;

public class KthSymbolGrammar {
    public int kthGrammar(int N, int K) {
        if (N == 1) return 0;

        int digit = kthGrammar(N - 1, (K + 1) / 2);

        if (digit == 0) {
            return K % 2 == 1 ? 0 : 1;
        }

        return K % 2;
    }
}
