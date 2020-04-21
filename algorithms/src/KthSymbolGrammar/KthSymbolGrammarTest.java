package algorithms.src.KthSymbolGrammar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthSymbolGrammarTest {
    @Test
    public void kthGrammar() {
        KthSymbolGrammar kthSymbolGrammar = new KthSymbolGrammar();
        assertEquals(0, kthSymbolGrammar.kthGrammar(1, 1));
        assertEquals(0, kthSymbolGrammar.kthGrammar(2, 1));
        assertEquals(1, kthSymbolGrammar.kthGrammar(2, 2));
        assertEquals(1, kthSymbolGrammar.kthGrammar(4, 5));
        assertEquals(1, kthSymbolGrammar.kthGrammar(5, 5));
        assertEquals(1, kthSymbolGrammar.kthGrammar(6, 5));
    }
}
