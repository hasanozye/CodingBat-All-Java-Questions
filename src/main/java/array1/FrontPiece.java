package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FrontPiece {

    public static int[] frontPiece(int[] nums){

        int len = nums.length;

        return len >= 2 ? new int[]{nums[0],nums[1]} : nums;

    }

    @Test
    public void testFrontPiece() {
        assertArrayEquals(new int[]{1, 2}, frontPiece(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2}, frontPiece(new int[]{1, 2}));
        assertArrayEquals(new int[]{1}, frontPiece(new int[]{1}));
        assertArrayEquals(new int[]{}, frontPiece(new int[]{}));
        assertArrayEquals(new int[]{6, 5}, frontPiece(new int[]{6, 5, 0}));
        assertArrayEquals(new int[]{6, 5}, frontPiece(new int[]{6, 5}));
        assertArrayEquals(new int[]{3, 1}, frontPiece(new int[]{3, 1, 4, 1, 5}));
        assertArrayEquals(new int[]{6}, frontPiece(new int[]{6}));
    }


}
