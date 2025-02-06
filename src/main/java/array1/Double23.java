package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Double23 {

    public static boolean double23(int[] nums) {

        if (nums.length == 2) {
            return (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
        }
        return false;
    }

    @Test
    public void testDouble23() {
        assertTrue(double23(new int[]{2, 2}));
        assertTrue(double23(new int[]{3, 3}));
        assertFalse(double23(new int[]{2, 3}));
        assertFalse(double23(new int[]{3, 2}));
        assertFalse(double23(new int[]{4, 5}));
        assertFalse(double23(new int[]{2}));
        assertFalse(double23(new int[]{3}));
        assertFalse(double23(new int[]{}));
        assertFalse(double23(new int[]{3, 4}));
    }


}
