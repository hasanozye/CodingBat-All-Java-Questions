package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestNear10 {

    public static boolean nearTen(int num) {
        int remainder = num % 10;
        return (remainder <= 2 || remainder >= 8);
    }

    @Test
    public void testNearTen() {
        assertTrue(nearTen(12));
        assertFalse(nearTen(17));
        assertTrue(nearTen(19));
        assertTrue(nearTen(31));
        assertFalse(nearTen(6));
        assertTrue(nearTen(10));
        assertTrue(nearTen(11));
        assertTrue(nearTen(21));
        assertTrue(nearTen(22));
        assertFalse(nearTen(23));
        assertFalse(nearTen(54));
        assertFalse(nearTen(155));
        assertTrue(nearTen(158));
        assertFalse(nearTen(3));
        assertTrue(nearTen(1));
    }



}
