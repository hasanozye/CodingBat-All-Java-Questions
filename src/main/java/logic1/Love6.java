package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Love6 {

    public static boolean love6(int a, int b) {

        return (a == 6 || b == 6 ||
                a + b == 6 || Math.abs(a - b) == 6);
    }

    @Test
    public void testLove6() {
        assertTrue(love6(6, 4));
        assertFalse(love6(4, 5));
        assertTrue(love6(1, 5));
        assertTrue(love6(6, 1));
        assertFalse(love6(1, 8));
        assertTrue(love6(1, 7));
        assertFalse(love6(7, 5));
        assertTrue(love6(8, 2));
        assertTrue(love6(6, 6));
        assertFalse(love6(-6, 2));
        assertTrue(love6(-4, -10));
        assertFalse(love6(-7, 1));
        assertTrue(love6(7, -1));
        assertTrue(love6(-6, 12));
        assertFalse(love6(-2, -4));
        assertTrue(love6(7, 1));
        assertFalse(love6(0, 9));
        assertFalse(love6(8, 3));
        assertTrue(love6(3, 3));
        assertFalse(love6(3, 4));
    }


}
