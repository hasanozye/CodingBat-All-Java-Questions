package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InOrder {

    public static boolean inOrder(int a, int b, int c, boolean bOk) {

        if (bOk) {

            return c > b;

        }

        return c > b && b > a;

    }

    @Test
    public void testInOrder() {
        assertTrue(inOrder(1, 2, 4, false));
        assertFalse(inOrder(1, 2, 1, false));
        assertTrue(inOrder(1, 1, 2, true));
        assertFalse(inOrder(3, 2, 4, false));
        assertTrue(inOrder(2, 3, 4, false));
        assertTrue(inOrder(3, 2, 4, true));
        assertFalse(inOrder(4, 2, 2, true));
        assertFalse(inOrder(4, 5, 2, true));
        assertTrue(inOrder(2, 4, 6, true));
        assertTrue(inOrder(7, 9, 10, false));
        assertFalse(inOrder(7, 5, 6, false));
        assertFalse(inOrder(7, 5, 4, true));
    }



}
