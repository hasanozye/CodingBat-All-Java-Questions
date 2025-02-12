package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SwapEnds {

    public static int[] swapEnds(int[] nums) {

        int lastIndex = nums[nums.length - 1];

        nums[nums.length - 1] = nums[0];
        nums[0] = lastIndex;
        return nums;
    }

    @Test
    public void testSwapEnds() {
        assertArrayEquals(new int[]{4, 2, 3, 1}, swapEnds(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{3, 2, 1}, swapEnds(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{5, 6, 7, 9, 8}, swapEnds(new int[]{8, 6, 7, 9, 5}));
        assertArrayEquals(new int[]{9, 1, 4, 1, 5, 3}, swapEnds(new int[]{3, 1, 4, 1, 5, 9}));
        assertArrayEquals(new int[]{2, 1}, swapEnds(new int[]{1, 2}));
        assertArrayEquals(new int[]{1}, swapEnds(new int[]{1}));
    }


}
