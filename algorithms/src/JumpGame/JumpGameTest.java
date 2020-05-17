package algorithms.src.JumpGame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JumpGameTest {
    @Test
    public void canJump() {
        JumpGame jumpGame = new JumpGame();
        assertTrue(jumpGame.canJump(new int[]{2,3,1,1,4}));
    }
}
