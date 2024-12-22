package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SquirrelPlay {

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return (temp >= 60 && temp <= 100);
        } else {
            return (temp >= 60 && temp <= 90);
        }
    }


    @Test
    void testSquirrelPlay() {
        assertTrue(SquirrelPlay.squirrelPlay(70, false));
        assertFalse(SquirrelPlay.squirrelPlay(95, false));
        assertTrue(SquirrelPlay.squirrelPlay(95, true));
        assertTrue(SquirrelPlay.squirrelPlay(90, false));
        assertTrue(SquirrelPlay.squirrelPlay(90, true));
        assertFalse(SquirrelPlay.squirrelPlay(50, false));
        assertFalse(SquirrelPlay.squirrelPlay(50, true));
        assertFalse(SquirrelPlay.squirrelPlay(100, false));
        assertTrue(SquirrelPlay.squirrelPlay(100, true));
        assertFalse(SquirrelPlay.squirrelPlay(105, true));
        assertFalse(SquirrelPlay.squirrelPlay(59, false));
        assertFalse(SquirrelPlay.squirrelPlay(59, true));
        assertTrue(SquirrelPlay.squirrelPlay(60, false));
    }


}
