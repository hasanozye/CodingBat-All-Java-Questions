package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstLast6 {

    public static boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }

    @Test
    void testFirstLast6() {
        assertTrue(FirstLast6.firstLast6(new int[]{1, 2, 6}));
        assertTrue(FirstLast6.firstLast6(new int[]{6, 1, 2, 3}));
        assertFalse(FirstLast6.firstLast6(new int[]{13, 6, 1, 2, 3}));
        assertTrue(FirstLast6.firstLast6(new int[]{13, 6, 1, 2, 6}));
        assertFalse(FirstLast6.firstLast6(new int[]{3, 2, 1}));
        assertFalse(FirstLast6.firstLast6(new int[]{3, 6, 1}));
        assertTrue(FirstLast6.firstLast6(new int[]{3, 6}));
        assertTrue(FirstLast6.firstLast6(new int[]{6}));
        assertFalse(FirstLast6.firstLast6(new int[]{3}));
        assertTrue(FirstLast6.firstLast6(new int[]{5, 6}));
        assertFalse(FirstLast6.firstLast6(new int[]{5, 5}));
        assertTrue(FirstLast6.firstLast6(new int[]{1, 2, 3, 4, 6}));
        assertFalse(FirstLast6.firstLast6(new int[]{1, 2, 3, 4}));
    }


}
