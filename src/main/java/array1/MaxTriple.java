package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxTriple {

    public static int maxTriple(int[] nums) {

        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];

        int max = first;

        if(middle > max){
            max = middle;
        }

        if(last > max){
            max = last;
        }

        return max;
    }

    @Test
    public void testMaxTriple() {
        assertEquals(3, maxTriple(new int[]{1, 2, 3}));
        assertEquals(5, maxTriple(new int[]{1, 5, 3}));
        assertEquals(5, maxTriple(new int[]{5, 2, 3}));
        assertEquals(3, maxTriple(new int[]{1, 2, 3, 1, 1}));
        assertEquals(5, maxTriple(new int[]{1, 7, 3, 1, 5}));
        assertEquals(5, maxTriple(new int[]{5, 1, 3, 7, 1}));
        assertEquals(5, maxTriple(new int[]{5, 1, 7, 3, 7, 8, 1}));
        assertEquals(9, maxTriple(new int[]{5, 1, 7, 9, 7, 8, 1}));
        assertEquals(9, maxTriple(new int[]{5, 1, 7, 3, 7, 8, 9}));
        assertEquals(5, maxTriple(new int[]{2, 2, 5, 1, 1}));
    }


}
