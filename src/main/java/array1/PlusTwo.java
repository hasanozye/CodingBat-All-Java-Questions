package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PlusTwo {

    public static int[] plusTwo(int[] a, int[] b) {

        return new int[]{a[0], a[1], b[0], b[1]};

    }


    @Test
    public void testPlusTwo() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, plusTwo(new int[]{1, 2}, new int[]{3, 4}));
        assertArrayEquals(new int[]{4, 4, 2, 2}, plusTwo(new int[]{4, 4}, new int[]{2, 2}));
        assertArrayEquals(new int[]{9, 2, 3, 4}, plusTwo(new int[]{9, 2}, new int[]{3, 4}));
    }


}
