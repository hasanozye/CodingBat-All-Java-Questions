package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Max1020 {

    public static int max1020(int a, int b) {
// First make it so the bigger value is in a
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }


    @Test
    void testMax1020() {
        assertEquals(19, Max1020.max1020(11, 19));
        assertEquals(19, Max1020.max1020(19, 11));
        assertEquals(11, Max1020.max1020(11, 9));
        assertEquals(0, Max1020.max1020(9, 21));
        assertEquals(10, Max1020.max1020(10, 21));
        assertEquals(10, Max1020.max1020(21, 10));
        assertEquals(11, Max1020.max1020(9, 11));
        assertEquals(10, Max1020.max1020(23, 10));
        assertEquals(20, Max1020.max1020(20, 10));
        assertEquals(20, Max1020.max1020(7, 20));
    }

}
