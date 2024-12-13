package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class In1020 {

    public static boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }


    @Test
    void testIn1020() {
        assertTrue(In1020.in1020(12, 99));
        assertTrue(In1020.in1020(21, 12));
        assertFalse(In1020.in1020(8, 99));
        assertTrue(In1020.in1020(99, 10));
        assertTrue(In1020.in1020(20, 20));
        assertFalse(In1020.in1020(21, 21));
        assertFalse(In1020.in1020(9, 9));
    }

}
