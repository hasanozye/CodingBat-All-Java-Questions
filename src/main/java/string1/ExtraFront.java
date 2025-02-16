package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtraFront {

    public static String extraFront(String str) {

        if (str.length() >= 2) {
            String firstTwo = str.substring(0, 2);
            return firstTwo + firstTwo + firstTwo;
        }

        return str + str + str;

    }


    @Test
    public void testExtraFront() {
        assertEquals("HeHeHe", extraFront("Hello"));
        assertEquals("ababab", extraFront("ab"));
        assertEquals("HHH", extraFront("H"));
        assertEquals("", extraFront(""));
        assertEquals("CaCaCa", extraFront("Candy"));
        assertEquals("CoCoCo", extraFront("Code"));
    }


}
