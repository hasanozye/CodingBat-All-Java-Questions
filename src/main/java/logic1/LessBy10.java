package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LessBy10 {

    public static boolean lessBy10(int a, int b, int c) {

        int abMax = Math.abs(a - b);
        int bcMax = Math.abs(b - c);
        int acMax = Math.abs(a - c);

        return (abMax >= 10 || bcMax >= 10 || acMax >= 10);
    }

    @Test
    public void testLessBy10() {
        assertTrue(lessBy10(1, 7, 11));
        assertFalse(lessBy10(1, 7, 10));
        assertTrue(lessBy10(11, 1, 7));
        assertFalse(lessBy10(10, 7, 1));
        assertTrue(lessBy10(-10, 2, 2));
        assertFalse(lessBy10(2, 11, 11));
        assertTrue(lessBy10(3, 3, 30));
        assertFalse(lessBy10(3, 3, 3));
        assertTrue(lessBy10(10, 1, 11));
        assertTrue(lessBy10(10, 11, 1));
        assertFalse(lessBy10(10, 11, 2));
        assertTrue(lessBy10(3, 30, 3));
        assertTrue(lessBy10(2, 2, -8));
        assertTrue(lessBy10(2, 8, 12));
    }


}
