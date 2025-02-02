package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sum2 {

    public static int sum2(int[] nums) {

        int len = nums.length;
        int sum = 0;

        for (int i = 0; i < len; i++) {

            if (len < 2) {
                sum += nums[i];
            } else {
                len = 2;
                sum += nums[i];
            }
        }
        return sum;
    }



    @Test
    void testSum2() {
        assertEquals(3, Sum2.sum2(new int[]{1, 2, 3}));
        assertEquals(2, Sum2.sum2(new int[]{1, 1}));
        assertEquals(2, Sum2.sum2(new int[]{1, 1, 1, 1}));
        assertEquals(3, Sum2.sum2(new int[]{1, 2}));
        assertEquals(1, Sum2.sum2(new int[]{1}));
        assertEquals(0, Sum2.sum2(new int[]{}));
        assertEquals(9, Sum2.sum2(new int[]{4, 5, 6}));
        assertEquals(4, Sum2.sum2(new int[]{4}));
    }


}
