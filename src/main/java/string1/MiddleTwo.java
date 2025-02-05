package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleTwo {

    public static String middleTwo(String str) {

        int midCh = str.length() / 2;
        return "" + str.charAt(midCh - 1) + str.charAt(midCh);
    }

    @Test
    public void testMiddleTwo() {
        assertEquals("ri", middleTwo("string"));
        assertEquals("od", middleTwo("code"));
        assertEquals("ct", middleTwo("Practice"));
        assertEquals("ab", middleTwo("ab"));
        assertEquals("45", middleTwo("0123456789"));
    }



}
