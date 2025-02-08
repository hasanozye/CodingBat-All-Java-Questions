package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BiggerTwo {

    public static int[] biggerTwo(int[] a, int[] b) {

        int aSum = 0;
        int bSum = 0;

        for (int i = 0; i < a.length - 1; i++) {
            aSum = a[0] + a[1];
            bSum = b[0] + b[1];
        }
        return (aSum >= bSum) ? a : b;
    }

    @Test
    public void testBiggerTwo() {
        assertArrayEquals(new int[]{3, 4}, biggerTwo(new int[]{1, 2}, new int[]{3, 4}));
        assertArrayEquals(new int[]{3, 4}, biggerTwo(new int[]{3, 4}, new int[]{1, 2}));
        assertArrayEquals(new int[]{1, 2}, biggerTwo(new int[]{1, 1}, new int[]{1, 2}));
        assertArrayEquals(new int[]{2, 1}, biggerTwo(new int[]{2, 1}, new int[]{1, 1}));
        assertArrayEquals(new int[]{2, 2}, biggerTwo(new int[]{2, 2}, new int[]{1, 3}));
        assertArrayEquals(new int[]{1, 3}, biggerTwo(new int[]{1, 3}, new int[]{2, 2}));
        assertArrayEquals(new int[]{6, 7}, biggerTwo(new int[]{6, 7}, new int[]{3, 1}));
    }


}
