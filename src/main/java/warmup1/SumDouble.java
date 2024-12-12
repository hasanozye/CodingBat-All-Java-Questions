package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumDouble {

    public static int sumDouble(int a, int b) {
        int sum = a + b;

        if (a == b) {
            sum *= 2;
        }

        return sum;
    }

    @Test
    void testSumDouble() {
        assertEquals(3, SumDouble.sumDouble(1, 2));
        assertEquals(5, SumDouble.sumDouble(3, 2));
        assertEquals(8, SumDouble.sumDouble(2, 2));
        assertEquals(-1, SumDouble.sumDouble(-1, 0));
        assertEquals(12, SumDouble.sumDouble(3, 3));
        assertEquals(0, SumDouble.sumDouble(0, 0));
        assertEquals(1, SumDouble.sumDouble(0, 1));
        assertEquals(7, SumDouble.sumDouble(3, 4));
    }


}
