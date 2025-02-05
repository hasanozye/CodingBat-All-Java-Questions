package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpecialEleven {

    public static boolean specialEleven(int n) {

        return n % 11 == 0 || n % 11 == 1;
    }

    @Test
    public void testSpecialEleven() {
        assertTrue(specialEleven(22));
        assertTrue(specialEleven(23));
        assertFalse(specialEleven(24));
        assertFalse(specialEleven(21));
        assertTrue(specialEleven(11));
        assertTrue(specialEleven(12));
        assertFalse(specialEleven(10));
        assertFalse(specialEleven(9));
        assertFalse(specialEleven(8));
        assertTrue(specialEleven(0));
        assertTrue(specialEleven(1));
        assertFalse(specialEleven(2));
        assertTrue(specialEleven(121));
        assertTrue(specialEleven(122));
        assertFalse(specialEleven(123));
        assertFalse(specialEleven(46));
        assertFalse(specialEleven(49));
        assertFalse(specialEleven(52));
        assertFalse(specialEleven(54));
        assertTrue(specialEleven(55));
    }


}
