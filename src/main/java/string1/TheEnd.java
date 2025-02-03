package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheEnd {

    public static String theEnd(String str, boolean front) {

        if (front) {
            return "" + str.charAt(0);
        } else {
            return "" + str.charAt(str.length() - 1);
        }
    }

    @Test
    public void testTheEnd() {
        assertEquals("H", theEnd("Hello", true));
        assertEquals("o", theEnd("Hello", false));
        assertEquals("o", theEnd("oh", true));
        assertEquals("h", theEnd("oh", false));
        assertEquals("x", theEnd("x", true));
        assertEquals("x", theEnd("x", false));
        assertEquals("j", theEnd("java", true));
        assertEquals("e", theEnd("chocolate", false));
        assertEquals("1", theEnd("1234", true));
        assertEquals("e", theEnd("code", false));
    }



}
