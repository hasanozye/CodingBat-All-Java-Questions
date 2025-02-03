package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestIn1To10 {

    public static boolean in1To10(int n, boolean outsideMode) {

        if (outsideMode) {
            return n <= 1 || n >= 10;
        } else {
            return n >= 1 && n <= 10;
        }
    }


    @Test
    public void testIn1To10() {
        assertTrue(in1To10(5, false));
        assertFalse(in1To10(11, false));
        assertTrue(in1To10(11, true));
        assertTrue(in1To10(10, false));
        assertTrue(in1To10(10, true));
        assertTrue(in1To10(9, false));
        assertFalse(in1To10(9, true));
        assertTrue(in1To10(1, false));
        assertTrue(in1To10(1, true));
        assertFalse(in1To10(0, false));
        assertTrue(in1To10(0, true));
        assertFalse(in1To10(-1, false));
        assertTrue(in1To10(-1, true));
        assertFalse(in1To10(99, false));
        assertTrue(in1To10(-99, true));
    }

}
