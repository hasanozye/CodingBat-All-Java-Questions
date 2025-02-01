package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Reverse3 {

    public static int[] reverse3(int[] nums) {
        int last = nums[0];
        nums[0] = nums[2];
        nums[2] = last;
        return nums;
    }

    @Test
    void testReverse3() {
        assertArrayEquals(new int[]{3, 2, 1}, Reverse3.reverse3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{9, 11, 5}, Reverse3.reverse3(new int[]{5, 11, 9}));
        assertArrayEquals(new int[]{0, 0, 7}, Reverse3.reverse3(new int[]{7, 0, 0}));
        assertArrayEquals(new int[]{2, 1, 2}, Reverse3.reverse3(new int[]{2, 1, 2}));
        assertArrayEquals(new int[]{1, 2, 1}, Reverse3.reverse3(new int[]{1, 2, 1}));
        assertArrayEquals(new int[]{3, 11, 2}, Reverse3.reverse3(new int[]{2, 11, 3}));
        assertArrayEquals(new int[]{5, 6, 0}, Reverse3.reverse3(new int[]{0, 6, 5}));
        assertArrayEquals(new int[]{3, 2, 7}, Reverse3.reverse3(new int[]{7, 2, 3}));
    }


}
