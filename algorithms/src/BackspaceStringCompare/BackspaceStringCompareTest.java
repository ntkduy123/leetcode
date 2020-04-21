package algorithms.src.BackspaceStringCompare;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BackspaceStringCompareTest {
    @Test
    public void backspaceCompare() {
        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
        assertTrue(backspaceStringCompare.backspaceCompare("ab#c", "ad#c"));
        assertTrue(backspaceStringCompare.backspaceCompare("nzp#o#g", "b#nzp#o#g"));
        assertTrue(backspaceStringCompare.backspaceCompare("ab##", "c#d#"));
        assertTrue(backspaceStringCompare.backspaceCompare("a##c", "#a#c"));
        assertFalse(backspaceStringCompare.backspaceCompare("a#c", "b"));
        assertFalse(backspaceStringCompare.backspaceCompare("bxj##tw", "bxj###tw"));
        assertFalse(backspaceStringCompare.backspaceCompare("j##yc##bs#srqpfzantto###########i#mwb", "j##yc##bs#srqpf#zantto###########i#mwb"));
    }
}
