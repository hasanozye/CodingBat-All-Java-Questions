package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Make2 {

    public static int[] make2(int[] a, int[] b) {

        int[] result = new int[2];
        int index = 0;

        // İlk olarak 'a' dizisinden eleman al
        for (int i = 0; i < a.length; i++) {
            result[index] = a[i];
            index++;
            if (index == 2) return result; // Eğer 2 eleman doldurulduysa return et
        }

        // Eğer hala 2 eleman doldurulmadıysa, 'b' dizisinden al
        for (int i = 0; i < b.length; i++) {
            result[index] = b[i];
            index++;
            if (index == 2) return result; // Eğer 2 eleman doldurulduysa return et
        }

        return result;

    }


    @Test
    public void testMake2() {
        assertArrayEquals(new int[]{4, 5}, make2(new int[]{4, 5}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{4, 1}, make2(new int[]{4}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2}, make2(new int[]{}, new int[]{1, 2}));
        assertArrayEquals(new int[]{1, 2}, make2(new int[]{1, 2}, new int[]{}));
        assertArrayEquals(new int[]{3, 1}, make2(new int[]{3}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{3, 1}, make2(new int[]{3}, new int[]{1}));
        assertArrayEquals(new int[]{3, 1}, make2(new int[]{3, 1, 4}, new int[]{1}));
        assertArrayEquals(new int[]{1, 1}, make2(new int[]{1}, new int[]{1}));
        assertArrayEquals(new int[]{1, 2}, make2(new int[]{1, 2, 3}, new int[]{7, 8}));
        assertArrayEquals(new int[]{7, 8}, make2(new int[]{7, 8}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{7, 1}, make2(new int[]{7}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{5, 4}, make2(new int[]{5, 4}, new int[]{2, 3, 7}));
    }


}
