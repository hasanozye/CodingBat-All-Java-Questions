package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaxEnd3 {

    public static int[] maxEnd3(int[] nums) {

        int lastInx = nums[nums.length - 1];
        int firstInx = nums[0];

        if (lastInx > firstInx) {
            return new int[]{lastInx, lastInx, lastInx};
        } else {
            return new int[]{firstInx, firstInx, firstInx};
        }
    }

    @Test
    void testMaxEnd3() {
        assertArrayEquals(new int[]{3, 3, 3}, MaxEnd3.maxEnd3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{11, 11, 11}, MaxEnd3.maxEnd3(new int[]{11, 5, 9}));
        assertArrayEquals(new int[]{3, 3, 3}, MaxEnd3.maxEnd3(new int[]{2, 11, 3}));
        assertArrayEquals(new int[]{11, 11, 11}, MaxEnd3.maxEnd3(new int[]{11, 3, 3}));
        assertArrayEquals(new int[]{11, 11, 11}, MaxEnd3.maxEnd3(new int[]{3, 11, 11}));
        assertArrayEquals(new int[]{2, 2, 2}, MaxEnd3.maxEnd3(new int[]{2, 2, 2}));
        assertArrayEquals(new int[]{2, 2, 2}, MaxEnd3.maxEnd3(new int[]{2, 11, 2}));
        assertArrayEquals(new int[]{1, 1, 1}, MaxEnd3.maxEnd3(new int[]{0, 0, 1}));
    }


}
