package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LastTwo {

    public static String lastTwo(String str) {

        String result = "";

        if (str.length() > 1) {
            result = str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
            return result;
        }else {
            return str;
        }


    }

    @Test
    public void testLastTwo() {
        assertEquals("codign", lastTwo("coding"));
        assertEquals("cta", lastTwo("cat"));
        assertEquals("ba", lastTwo("ab"));
        assertEquals("a", lastTwo("a"));
        assertEquals("", lastTwo(""));
    }
}
