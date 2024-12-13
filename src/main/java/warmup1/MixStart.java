package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MixStart {

    public static boolean mixStart(String str) {
        if (str.length() >= 3 &&
                str.substring(1, 3).equals("ix")) {
            return true;
        }

        return false;
    }


    @Test
    void testMixStart() {
        assertTrue(MixStart.mixStart("mix snacks"));
        assertTrue(MixStart.mixStart("pix snacks"));
        assertFalse(MixStart.mixStart("piz snacks"));
        assertTrue(MixStart.mixStart("nix"));
        assertFalse(MixStart.mixStart("ni"));
        assertFalse(MixStart.mixStart("n"));
        assertFalse(MixStart.mixStart(""));
    }


}
