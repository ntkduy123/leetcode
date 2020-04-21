package algorithms.src.ValidParenthesisString;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesisStringTest {
    @Test
    public void checkValidStringTest() {
        ValidParenthesisString validParenthesisString = new ValidParenthesisString();
//        assertTrue(validParenthesisString.checkValidString("(*))((*)"));
        assertTrue(validParenthesisString.checkValidString("(*)"));
//        assertTrue(validParenthesisString.checkValidString("(*))"));
//        assertTrue(validParenthesisString.checkValidString("((*)))(())"));
//        assertTrue(validParenthesisString.checkValidString("((*(*)"));
//        assertTrue(validParenthesisString.checkValidString("(*))"));
    }
}
