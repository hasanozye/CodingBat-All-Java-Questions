package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Makes10 {

    public static boolean makes10(int a, int b) {
        boolean flag = (((a == 10) || (b == 10)) ||
                (a + b == 10));

        return flag;
    }


    @Test
    void testMakes10() {
        assertTrue(Makes10.makes10(9, 10));
        assertFalse(Makes10.makes10(9, 9));
        assertTrue(Makes10.makes10(1, 9));
        assertTrue(Makes10.makes10(10, 1));
        assertTrue(Makes10.makes10(10, 10));
        assertTrue(Makes10.makes10(8, 2));
        assertFalse(Makes10.makes10(8, 3));
        assertTrue(Makes10.makes10(10, 42));
        assertTrue(Makes10.makes10(12, -2));
    }


}
