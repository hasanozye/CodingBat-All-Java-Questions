package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sum3 {

    public static int sum3(int[] nums) {

        return nums[0] + nums[1] + nums[2];

    }

    @Test
    void testSum3() {
        assertEquals(6, Sum3.sum3(new int[]{1, 2, 3}));
        assertEquals(18, Sum3.sum3(new int[]{5, 11, 2}));
        assertEquals(7, Sum3.sum3(new int[]{7, 0, 0}));
        assertEquals(4, Sum3.sum3(new int[]{1, 2, 1}));
        assertEquals(3, Sum3.sum3(new int[]{1, 1, 1}));
        assertEquals(11, Sum3.sum3(new int[]{2, 7, 2}));
    }



}
