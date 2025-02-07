package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HasBad {

    public static boolean hasBad(String str) {

        if (str.length() >= 3 && str.substring(0, 3).equals("bad")) {
            return true;
        }

        if (str.length() >= 4 && str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;

    }

    @Test
    public void testHasBad() {
        assertTrue(hasBad("badxx"));
        assertTrue(hasBad("xbadxx"));
        assertFalse(hasBad("xxbadxx"));
        assertFalse(hasBad("code"));
        assertTrue(hasBad("bad"));
        assertFalse(hasBad("ba"));
        assertFalse(hasBad("xba"));
        assertTrue(hasBad("xbad"));
        assertFalse(hasBad(""));
        assertTrue(hasBad("badyy"));
    }



}
