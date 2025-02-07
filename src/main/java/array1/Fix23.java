package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Fix23 {

    public static int[] fix23(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }

    @Test
    public void testFix23() {
        assertArrayEquals(new int[]{1, 2, 0}, fix23(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{2, 0, 5}, fix23(new int[]{2, 3, 5}));
        assertArrayEquals(new int[]{1, 2, 1}, fix23(new int[]{1, 2, 1}));
        assertArrayEquals(new int[]{3, 2, 1}, fix23(new int[]{3, 2, 1}));
        assertArrayEquals(new int[]{2, 2, 0}, fix23(new int[]{2, 2, 3}));
        assertArrayEquals(new int[]{2, 0, 3}, fix23(new int[]{2, 3, 3}));
    }



}
