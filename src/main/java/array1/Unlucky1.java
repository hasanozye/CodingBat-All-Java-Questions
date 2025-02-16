package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Unlucky1 {

    public static boolean unlucky1(int[] nums){

        int len = nums.length;

        if (len < 2) return false;

        // Baştaki ilk iki elemanı kontrol et
        if (nums[0] == 1 && nums[1] == 3) return true;


        if (len > 2 && nums[1] == 1 && nums[2] == 3) return true;

        // Sondaki son iki elemanı kontrol et
        if (nums[len - 2] == 1 && nums[len - 1] == 3) return true;

        return false;
    }

    @Test
    public void testUnlucky1() {
        assertTrue(unlucky1(new int[]{1, 3, 4, 5}));
        assertTrue(unlucky1(new int[]{2, 1, 3, 4, 5}));
        assertFalse(unlucky1(new int[]{1, 1, 1}));
        assertTrue(unlucky1(new int[]{1, 3, 1}));
        assertTrue(unlucky1(new int[]{1, 1, 3}));
        assertFalse(unlucky1(new int[]{1, 2, 3}));
        assertFalse(unlucky1(new int[]{3, 3, 3}));
        assertTrue(unlucky1(new int[]{1, 3}));
        assertFalse(unlucky1(new int[]{1, 4}));
        assertFalse(unlucky1(new int[]{1}));
        assertFalse(unlucky1(new int[]{}));
        assertFalse(unlucky1(new int[]{1, 1, 1, 3, 1}));
        assertTrue(unlucky1(new int[]{1, 3, 1, 1}));
        assertTrue(unlucky1(new int[]{1, 1, 1, 1, 3}));
        assertFalse(unlucky1(new int[]{1, 4, 1, 5}));
        assertFalse(unlucky1(new int[]{1, 1, 2, 3}));
        assertFalse(unlucky1(new int[]{2, 3, 1}));
        assertTrue(unlucky1(new int[]{2, 3, 1, 3}));
        assertTrue(unlucky1(new int[]{1, 2, 3, 4, 1, 3}));
    }


}
