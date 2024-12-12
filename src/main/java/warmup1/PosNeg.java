package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PosNeg {

    public static boolean posNeg(int a, int b, boolean negative) {
        boolean flag = false;

        if (!negative) {
            if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
                flag = true;
            }
        } else {
            if (a < 0 && b < 0) {
                flag = true;
            }
        }

        return flag;
    }


    @Test
    void testPosNeg() {
        assertTrue(PosNeg.posNeg(1, -1, false));
        assertTrue(PosNeg.posNeg(-1, 1, false));
        assertTrue(PosNeg.posNeg(-4, -5, true));
        assertFalse(PosNeg.posNeg(-4, -5, false));
        assertTrue(PosNeg.posNeg(-4, 5, false));
        assertFalse(PosNeg.posNeg(-4, 5, true));
        assertFalse(PosNeg.posNeg(1, 1, false));
        assertFalse(PosNeg.posNeg(-1, -1, false));
        assertFalse(PosNeg.posNeg(-1, 1, true));
        assertFalse(PosNeg.posNeg(1, 1, true));
        assertTrue(PosNeg.posNeg(-5, -5, true));
        assertTrue(PosNeg.posNeg(-6, 6, false));
        assertTrue(PosNeg.posNeg(-5, 6, false));
        assertTrue(PosNeg.posNeg(-5, -6, true));
        assertFalse(PosNeg.posNeg(-5, -6, false));
    }


}
