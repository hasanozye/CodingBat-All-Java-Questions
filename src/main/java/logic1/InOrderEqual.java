package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InOrderEqual {

    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) return a <= b && b <= c;
        return a < b && b < c;
    }


    @Test
    public void testInOrderEqual() {
        assertTrue(inOrderEqual(2, 5, 11, false));
        assertFalse(inOrderEqual(5, 7, 6, false));
        assertTrue(inOrderEqual(5, 5, 7, true));
        assertFalse(inOrderEqual(5, 5, 7, false));
        assertFalse(inOrderEqual(2, 5, 4, false));
        assertFalse(inOrderEqual(3, 4, 3, false));
        assertFalse(inOrderEqual(3, 4, 4, false));
        assertFalse(inOrderEqual(3, 4, 3, true));
        assertTrue(inOrderEqual(3, 4, 4, true));
        assertTrue(inOrderEqual(1, 5, 5, true));
        assertTrue(inOrderEqual(5, 5, 5, true));
        assertFalse(inOrderEqual(2, 2, 1, true));
        assertFalse(inOrderEqual(9, 2, 2, true));
        assertFalse(inOrderEqual(0, 1, 0, true));
    }


}
