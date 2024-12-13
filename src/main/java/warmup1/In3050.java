package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class In3050 {

    public static boolean in3050(int a, int b) {
        return
                (((a>= 30 && a<=40) &&
                        (b>= 30 && b<=40)) ||
                        ((a>= 40 && a<=50) &&
                                (b>= 40 && b<=50)));
    }


    @Test
    void testIn3050() {
        assertTrue(In3050.in3050(30, 31));
        assertFalse(In3050.in3050(30, 41));
        assertTrue(In3050.in3050(40, 50));
        assertFalse(In3050.in3050(40, 51));
        assertFalse(In3050.in3050(39, 50));
        assertTrue(In3050.in3050(40, 39));
        assertTrue(In3050.in3050(49, 48));
        assertTrue(In3050.in3050(50, 40));
        assertFalse(In3050.in3050(50, 51));
        assertTrue(In3050.in3050(35, 36));
        assertFalse(In3050.in3050(35, 45));
    }


}
