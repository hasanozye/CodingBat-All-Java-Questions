package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class More20 {

    public static boolean more20(int n) {

        return n % 20 == 1 || n % 20 == 2;

    }


    @Test
    public void testMore20() {
        assertFalse(more20(20));
        assertTrue(more20(21));
        assertTrue(more20(22));
        assertFalse(more20(23));
        assertFalse(more20(25));
        assertFalse(more20(30));
        assertFalse(more20(31));
        assertFalse(more20(59));
        assertFalse(more20(60));
        assertTrue(more20(61));
        assertTrue(more20(62));
        assertFalse(more20(1020));
        assertTrue(more20(1021));
        assertFalse(more20(1000));
        assertTrue(more20(1001));
        assertFalse(more20(50));
        assertFalse(more20(55));
        assertFalse(more20(40));
        assertTrue(more20(41));
        assertFalse(more20(39));
        assertTrue(more20(42));
    }


}
