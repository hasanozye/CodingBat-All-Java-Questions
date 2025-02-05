package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class No23 {

    public static boolean no23(int[] nums) {

        int first = nums[0];
        int sec = nums[1];

        return ((first != 2 && first != 3) &&
                (sec != 2 && sec != 3));
    }

    @Test
    public void testNo23() {
        assertTrue(no23(new int[]{4, 5}));
        assertFalse(no23(new int[]{4, 2}));
        assertFalse(no23(new int[]{3, 5}));
        assertTrue(no23(new int[]{1, 9}));
        assertFalse(no23(new int[]{2, 9}));
        assertFalse(no23(new int[]{1, 3}));
        assertTrue(no23(new int[]{1, 1}));
        assertFalse(no23(new int[]{2, 2}));
        assertFalse(no23(new int[]{3, 3}));
        assertTrue(no23(new int[]{7, 8}));
        assertTrue(no23(new int[]{8, 7}));
    }


}
