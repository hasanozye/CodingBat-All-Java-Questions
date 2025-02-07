package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TeenSum {

    public static int teenSum(int a, int b) {

        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            return a + b;
        }

    }


    @Test
    public void testTeenSum() {
        assertEquals(7, teenSum(3, 4));
        assertEquals(19, teenSum(10, 13));
        assertEquals(19, teenSum(13, 2));
        assertEquals(19, teenSum(3, 19));
        assertEquals(19, teenSum(13, 13));
        assertEquals(20, teenSum(10, 10));
        assertEquals(19, teenSum(6, 14));
        assertEquals(19, teenSum(15, 2));
        assertEquals(19, teenSum(19, 19));
        assertEquals(19, teenSum(2, 18));
        assertEquals(16, teenSum(12, 4));
        assertEquals(22, teenSum(2, 20));
        assertEquals(19, teenSum(2, 17));
        assertEquals(19, teenSum(2, 16));
        assertEquals(13, teenSum(6, 7));
    }


}
