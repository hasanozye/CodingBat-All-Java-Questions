package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MakeMiddle {

    public static int[] makeMiddle(int[] nums) {

        int midIndex = nums.length / 2;
        return new int[]{nums[midIndex - 1], nums[midIndex]};

    }

    @Test
    public void testMakeMiddle() {
        assertArrayEquals(new int[]{2, 3}, makeMiddle(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{2, 3}, makeMiddle(new int[]{7, 1, 2, 3, 4, 9}));
        assertArrayEquals(new int[]{1, 2}, makeMiddle(new int[]{1, 2}));
        assertArrayEquals(new int[]{2, 4}, makeMiddle(new int[]{5, 2, 4, 7}));
        assertArrayEquals(new int[]{4, 3}, makeMiddle(new int[]{9, 0, 4, 3, 9, 1}));
    }


}
