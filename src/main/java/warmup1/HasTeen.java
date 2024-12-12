package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HasTeen {

    public static boolean hasTeen(int a, int b, int c) {
        boolean isTeen = false;
        if ((a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19) ||
                (c >= 13 && c <= 19)
        ) {
            isTeen = true;
        }

        return isTeen;
    }


    @Test
    void testHasTeen() {
        assertTrue(HasTeen.hasTeen(13, 20, 10));
        assertTrue(HasTeen.hasTeen(20, 19, 10));
        assertTrue(HasTeen.hasTeen(20, 10, 13));
        assertFalse(HasTeen.hasTeen(1, 20, 12));
        assertTrue(HasTeen.hasTeen(19, 20, 12));
        assertTrue(HasTeen.hasTeen(12, 20, 19));
        assertFalse(HasTeen.hasTeen(12, 9, 20));
        assertTrue(HasTeen.hasTeen(12, 18, 20));
        assertTrue(HasTeen.hasTeen(14, 2, 20));
        assertFalse(HasTeen.hasTeen(4, 2, 20));
        assertFalse(HasTeen.hasTeen(11, 22, 22));
    }


}
