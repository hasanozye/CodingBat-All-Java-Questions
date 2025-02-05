package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Has23 {

    public static boolean has23(int[] nums){

        boolean flag = false;


        for(int num : nums){
            if (num == 2 || num == 3) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Test
    public void testHas23() {
        assertTrue(has23(new int[]{2, 5}));
        assertTrue(has23(new int[]{4, 3}));
        assertFalse(has23(new int[]{4, 5}));
        assertTrue(has23(new int[]{2, 2}));
        assertTrue(has23(new int[]{3, 2}));
        assertTrue(has23(new int[]{3, 3}));
        assertFalse(has23(new int[]{7, 7}));
        assertTrue(has23(new int[]{3, 9}));
        assertFalse(has23(new int[]{9, 5}));
    }


}
