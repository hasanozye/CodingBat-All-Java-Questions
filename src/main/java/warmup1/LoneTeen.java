package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoneTeen {

    public static boolean loneTeen(int a, int b) {
        boolean aFlag = false;
        boolean bFlag = false;
        boolean result = false;

        if (a >= 13 && a <= 19) {
            aFlag = true;
        }

        if (b >= 13 && b <= 19) {
            bFlag = true;
        }

        if(     (aFlag == true) && (bFlag == false) ||
                (aFlag == false) && (bFlag == true)  ){
            result = true;
        }
        return result;



    }

    @Test
    void testLoneTeen() {
        assertTrue(LoneTeen.loneTeen(13, 99));
        assertTrue(LoneTeen.loneTeen(21, 19));
        assertFalse(LoneTeen.loneTeen(13, 13));
        assertTrue(LoneTeen.loneTeen(14, 20));
        assertTrue(LoneTeen.loneTeen(20, 15));
        assertFalse(LoneTeen.loneTeen(16, 17));
        assertTrue(LoneTeen.loneTeen(16, 9));
        assertFalse(LoneTeen.loneTeen(16, 18));
        assertFalse(LoneTeen.loneTeen(13, 19));
        assertTrue(LoneTeen.loneTeen(13, 20));
        assertTrue(LoneTeen.loneTeen(6, 18));
        assertTrue(LoneTeen.loneTeen(99, 13));
        assertFalse(LoneTeen.loneTeen(99, 99));
    }



}
