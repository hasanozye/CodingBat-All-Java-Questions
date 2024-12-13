package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Or35 {

    public static boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    @Test
    void testOr35() {
        assertTrue(Or35.or35(3));
        assertTrue(Or35.or35(10));
        assertFalse(Or35.or35(8));
        assertTrue(Or35.or35(15));
        assertTrue(Or35.or35(5));
        assertTrue(Or35.or35(9));
        assertFalse(Or35.or35(4));
        assertFalse(Or35.or35(7));
        assertTrue(Or35.or35(6));
        assertFalse(Or35.or35(17));
        assertTrue(Or35.or35(18));
        assertFalse(Or35.or35(29));
        assertTrue(Or35.or35(45));
        assertTrue(Or35.or35(99));
        assertTrue(Or35.or35(100));
        assertFalse(Or35.or35(101));
        assertFalse(Or35.or35(121));
        assertFalse(Or35.or35(122));
        assertTrue(Or35.or35(123));
    }


}
