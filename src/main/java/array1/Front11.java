package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Front11 {

    public static int[] front11(int[] a, int[] b) {

        if (a.length == 0 && b.length == 0) return new int[]{};
        if (a.length == 0) return new int[]{b[0]};
        if (b.length == 0) return new int[]{a[0]};

        return new int[]{a[0], b[0]};

    }

    @Test
    public void testFront11() {
        assertArrayEquals(new int[]{1, 7}, front11(new int[]{1, 2, 3}, new int[]{7, 9, 8}));
        assertArrayEquals(new int[]{1, 2}, front11(new int[]{1}, new int[]{2}));
        assertArrayEquals(new int[]{1}, front11(new int[]{1, 7}, new int[]{}));
        assertArrayEquals(new int[]{2}, front11(new int[]{}, new int[]{2, 8}));
        assertArrayEquals(new int[]{}, front11(new int[]{}, new int[]{}));
        assertArrayEquals(new int[]{3, 1}, front11(new int[]{3}, new int[]{1, 4, 1, 9}));
        assertArrayEquals(new int[]{1}, front11(new int[]{1, 4, 1, 9}, new int[]{}));
    }


}
