package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Old35 {

    public static boolean old35(int n) {

        if (n % 3 == 0 && n % 5 == 0) {
            return false;
        }

        return (n % 3 == 0 || n % 5 == 0);

    }
    @Test
    public void testOld35() {
        assertTrue(old35(3));
        assertTrue(old35(10));
        assertFalse(old35(15));
        assertTrue(old35(5));
        assertTrue(old35(9));
        assertFalse(old35(8));
        assertFalse(old35(7));
        assertTrue(old35(6));
        assertFalse(old35(17));
        assertTrue(old35(18));
        assertFalse(old35(29));
        assertTrue(old35(20));
        assertTrue(old35(21));
        assertFalse(old35(22));
        assertFalse(old35(45));
        assertTrue(old35(99));
    }


}
