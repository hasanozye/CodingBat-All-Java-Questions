package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FrontAgain {

    public static boolean frontAgain(String str) {

        return str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2));
    }

    @Test
    public void testFrontAgain() {
        assertTrue(frontAgain("edited"));
        assertFalse(frontAgain("edit"));
        assertTrue(frontAgain("ed"));
        assertTrue(frontAgain("jj"));
        assertTrue(frontAgain("jjj"));
        assertTrue(frontAgain("jjjj"));
        assertFalse(frontAgain("jjjk"));
        assertFalse(frontAgain("x"));
        assertFalse(frontAgain(""));
        assertFalse(frontAgain("java"));
        assertTrue(frontAgain("javaja"));
    }


}
