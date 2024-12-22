package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateLeft3 {

    public static int[] rotateLeft3(int[] nums) {
        int[] temp = new int[1];
        temp[0] = nums[0];
        nums[0] = nums[1];
        nums[1] = nums[2];
        nums[2] = temp[0];
        return nums;
    }

    @Test
    void testRotateLeft3() {
        assertArrayEquals(new int[]{2, 3, 1}, RotateLeft3.rotateLeft3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{11, 9, 5}, RotateLeft3.rotateLeft3(new int[]{5, 11, 9}));
        assertArrayEquals(new int[]{0, 0, 7}, RotateLeft3.rotateLeft3(new int[]{7, 0, 0}));
        assertArrayEquals(new int[]{2, 1, 1}, RotateLeft3.rotateLeft3(new int[]{1, 2, 1}));
        assertArrayEquals(new int[]{0, 1, 0}, RotateLeft3.rotateLeft3(new int[]{0, 0, 1}));
    }

}
