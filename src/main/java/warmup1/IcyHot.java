package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IcyHot {

    public static boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) ||
                (temp1 > 100 && temp2 < 0)) {
            return true;
        }

        return false;
    }

    @Test
    void testIcyHot() {
        assertTrue(IcyHot.icyHot(120, -1));
        assertTrue(IcyHot.icyHot(-1, 120));
        assertFalse(IcyHot.icyHot(2, 120));
        assertFalse(IcyHot.icyHot(-1, 100));
        assertFalse(IcyHot.icyHot(-2, -2));
        assertFalse(IcyHot.icyHot(120, 120));
    }


}
