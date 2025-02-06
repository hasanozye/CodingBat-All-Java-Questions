package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Less20 {

    public static boolean less20(int n) {
        return (n % 20 == 18 || n % 20 == 19);
    }


    @Test
    public void testLess20() {
        assertTrue(less20(18));
        assertTrue(less20(19));
        assertFalse(less20(20));
        assertFalse(less20(8));
        assertFalse(less20(17));
        assertFalse(less20(23));
        assertFalse(less20(25));
        assertFalse(less20(30));
        assertFalse(less20(31));
        assertTrue(less20(58));
        assertTrue(less20(59));
        assertFalse(less20(60));
        assertFalse(less20(61));
        assertFalse(less20(62));
        assertFalse(less20(1017));
        assertTrue(less20(1018));
        assertTrue(less20(1019));
        assertFalse(less20(1020));
        assertFalse(less20(1021));
        assertFalse(less20(1022));
        assertFalse(less20(1023));
        assertFalse(less20(37));
    }


}
