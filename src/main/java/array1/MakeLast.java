package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MakeLast {

    public static int[] makeLast(int[] nums) {

        int len = nums.length;
        int[] result = new int[len * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }


    @Test
    public void testMakeLast() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 6}, makeLast(new int[]{4, 5, 6}));
        assertArrayEquals(new int[]{0, 0, 0, 2}, makeLast(new int[]{1, 2}));
        assertArrayEquals(new int[]{0, 3}, makeLast(new int[]{3}));
        assertArrayEquals(new int[]{0, 0}, makeLast(new int[]{0}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 7}, makeLast(new int[]{7, 7, 7}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 4}, makeLast(new int[]{3, 1, 4}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0, 4}, makeLast(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0, 0}, makeLast(new int[]{1, 2, 3, 0}));
        assertArrayEquals(new int[]{0, 0, 0, 4}, makeLast(new int[]{2, 4}));
    }


}
