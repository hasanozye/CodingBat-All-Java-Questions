package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SameFirstLast {

    public static boolean sameFirstLast(int[] nums) {
        return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
    }

    @Test
    void testSameFirstLast() {
        assertFalse(SameFirstLast.sameFirstLast(new int[]{1, 2, 3}));
        assertTrue(SameFirstLast.sameFirstLast(new int[]{1, 2, 3, 1}));
        assertTrue(SameFirstLast.sameFirstLast(new int[]{1, 2, 1}));
        assertTrue(SameFirstLast.sameFirstLast(new int[]{7}));
        assertFalse(SameFirstLast.sameFirstLast(new int[]{}));
        assertTrue(SameFirstLast.sameFirstLast(new int[]{1, 2, 3, 4, 5, 1}));
        assertFalse(SameFirstLast.sameFirstLast(new int[]{1, 2, 3, 4, 5, 13}));
        assertTrue(SameFirstLast.sameFirstLast(new int[]{13, 2, 3, 4, 5, 13}));
        assertTrue(SameFirstLast.sameFirstLast(new int[]{7, 7}));
    }


}
