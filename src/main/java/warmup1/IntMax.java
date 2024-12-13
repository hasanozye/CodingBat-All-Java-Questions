package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntMax {

    public static int intMax(int a, int b, int c) {
        int max = a;
        if (b > a && b > c) {
            max = b;
        } else if (c > a && c > b) {
            max = c;
        }
        return max;
    }


    @Test
    void testIntMax() {
        assertEquals(3, IntMax.intMax(1, 2, 3));
        assertEquals(3, IntMax.intMax(1, 3, 2));
        assertEquals(3, IntMax.intMax(3, 2, 1));
        assertEquals(9, IntMax.intMax(9, 3, 3));
        assertEquals(9, IntMax.intMax(3, 9, 3));
        assertEquals(9, IntMax.intMax(3, 3, 9));
        assertEquals(8, IntMax.intMax(8, 2, 3));
        assertEquals(-1, IntMax.intMax(-3, -1, -2));
        assertEquals(6, IntMax.intMax(6, 2, 5));
        assertEquals(6, IntMax.intMax(5, 6, 2));
        assertEquals(6, IntMax.intMax(5, 2, 6));
    }


}
