package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LastDigit {

    public static boolean lastDigit(int a, int b) {
        int aMod = a % 10;
        int bMod = b % 10;
        return aMod == bMod;

    }

    @Test
    void testLastDigit() {
        assertTrue(LastDigit.lastDigit(7, 17));     // true
        assertFalse(LastDigit.lastDigit(6, 17));   // false
        assertTrue(LastDigit.lastDigit(3, 113));   // true
        assertFalse(LastDigit.lastDigit(114, 113)); // false
        assertTrue(LastDigit.lastDigit(114, 4));   // true
        assertTrue(LastDigit.lastDigit(10, 0));    // true
        assertFalse(LastDigit.lastDigit(11, 0));   // false
    }

}
