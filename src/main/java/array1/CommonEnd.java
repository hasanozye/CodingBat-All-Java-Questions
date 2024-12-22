package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommonEnd {

    public static boolean commonEnd(int[] a, int[] b) {

        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }

    @Test
    void testCommonEnd() {
        assertTrue(CommonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
        assertFalse(CommonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
        assertTrue(CommonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));
        assertTrue(CommonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{1}));
        assertFalse(CommonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{2}));
    }


}
