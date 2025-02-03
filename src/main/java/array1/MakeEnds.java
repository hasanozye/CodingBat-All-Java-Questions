package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MakeEnds {

    public static int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    @Test
    public void testMakeEnds() {
        assertArrayEquals(new int[]{1, 3}, makeEnds(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 4}, makeEnds(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{7, 2}, makeEnds(new int[]{7, 4, 6, 2}));
        assertArrayEquals(new int[]{1, 3}, makeEnds(new int[]{1, 2, 2, 2, 2, 2, 2, 2, 3}));
        assertArrayEquals(new int[]{7, 4}, makeEnds(new int[]{7, 4}));
        assertArrayEquals(new int[]{7, 7}, makeEnds(new int[]{7}));
        assertArrayEquals(new int[]{5, 9}, makeEnds(new int[]{5, 2, 9}));
        assertArrayEquals(new int[]{2, 1}, makeEnds(new int[]{2, 3, 4, 1}));
    }


}
