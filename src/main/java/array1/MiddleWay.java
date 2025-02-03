package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MiddleWay {

    public static int[] middleWay(int[] a, int[] b) {

        int[] last = new int[]{a[1], b[1]};
        return last;

    }


    @Test
    public void testMiddleWay() {
        assertArrayEquals(new int[]{2, 5}, middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        assertArrayEquals(new int[]{7, 8}, middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0}));
        assertArrayEquals(new int[]{2, 4}, middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5}));
        assertArrayEquals(new int[]{9, 8}, middleWay(new int[]{1, 9, 7}, new int[]{4, 8, 8}));
        assertArrayEquals(new int[]{2, 1}, middleWay(new int[]{1, 2, 3}, new int[]{3, 1, 4}));
        assertArrayEquals(new int[]{2, 1}, middleWay(new int[]{1, 2, 3}, new int[]{4, 1, 1}));
    }


}
