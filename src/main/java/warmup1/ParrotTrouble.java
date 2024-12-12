package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParrotTrouble {

    public static boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }


    @Test
    void testParrotTrouble() {
        assertTrue(ParrotTrouble.parrotTrouble(true, 6));
        assertFalse(ParrotTrouble.parrotTrouble(true, 7));
        assertFalse(ParrotTrouble.parrotTrouble(false, 6));
        assertTrue(ParrotTrouble.parrotTrouble(true, 21));
        assertFalse(ParrotTrouble.parrotTrouble(false, 21));
        assertFalse(ParrotTrouble.parrotTrouble(false, 20));
        assertTrue(ParrotTrouble.parrotTrouble(true, 23));
        assertFalse(ParrotTrouble.parrotTrouble(false, 23));
        assertFalse(ParrotTrouble.parrotTrouble(true, 20));
        assertFalse(ParrotTrouble.parrotTrouble(false, 12));
    }


}
