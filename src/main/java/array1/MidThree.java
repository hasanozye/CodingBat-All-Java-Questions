package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MidThree {

    public static int[] midThree(int[] nums) {

        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2], nums[nums.length / 2 + 1]};

    }


    @Test
    public void testMidThree() {
        assertArrayEquals(new int[]{2, 3, 4}, midThree(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{7, 5, 3}, midThree(new int[]{8, 6, 7, 5, 3, 0, 9}));
        assertArrayEquals(new int[]{1, 2, 3}, midThree(new int[]{1, 2, 3}));
    }


}
