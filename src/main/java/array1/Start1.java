package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Start1 {

    public static int start1(int[] a, int[] b) {

        int aCount = 0;
        int bCount = 0;

        if (a.length > 0 && a[0] == 1) {
            aCount++;
        }

        if (b.length > 0 && b[0] == 1) {
            bCount++;
        }
        return aCount + bCount;
    }

    @Test
    public void testStart1() {
        assertEquals(2, start1(new int[]{1, 2, 3}, new int[]{1, 3}));
        assertEquals(1, start1(new int[]{7, 2, 3}, new int[]{1}));
        assertEquals(1, start1(new int[]{1, 2}, new int[]{}));
        assertEquals(1, start1(new int[]{}, new int[]{1, 2}));
        assertEquals(0, start1(new int[]{7}, new int[]{}));
        assertEquals(1, start1(new int[]{7}, new int[]{1}));
        assertEquals(2, start1(new int[]{1}, new int[]{1}));
        assertEquals(0, start1(new int[]{7}, new int[]{8}));
        assertEquals(0, start1(new int[]{}, new int[]{}));
        assertEquals(2, start1(new int[]{1, 3}, new int[]{1}));
    }


}
