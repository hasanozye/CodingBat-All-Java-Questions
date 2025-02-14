package logic1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TwoAsOne {

    public static boolean twoAsOne(int a, int b, int c) {

        if (a + b == c) {
            return true;
        } else if (a + c == b) {
            return true;
        } else return b + c == a;
    }

    @Test
    public void testTwoAsOne() {
        assertTrue(twoAsOne(1, 2, 3));
        assertTrue(twoAsOne(3, 1, 2));
        assertFalse(twoAsOne(3, 2, 2));
        assertTrue(twoAsOne(2, 3, 1));
        assertTrue(twoAsOne(5, 3, -2));
        assertFalse(twoAsOne(5, 3, -3));
        assertTrue(twoAsOne(2, 5, 3));
        assertFalse(twoAsOne(9, 5, 5));
        assertTrue(twoAsOne(9, 4, 5));
        assertTrue(twoAsOne(5, 4, 9));
        assertFalse(twoAsOne(5, 3, 0));
        assertFalse(twoAsOne(3, 3, 2));
    }

}
