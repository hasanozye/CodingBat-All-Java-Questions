package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MonkeyTrouble {

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    @Test
    void testMonkeyTrouble() {
        assertTrue(MonkeyTrouble.monkeyTrouble(true, true));
        assertTrue(MonkeyTrouble.monkeyTrouble(false, false));
        assertFalse(MonkeyTrouble.monkeyTrouble(true, false));
        assertFalse(MonkeyTrouble.monkeyTrouble(false, true));
    }


}
