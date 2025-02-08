package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtFirst {

    public static String atFirst(String str) {

        if (str.length() == 0) {
            return "@@";
        } else if (str.length() == 1) {
            return str.charAt(0) + "@";
        } else {
            return str.substring(0, 2);
        }

    }

    @Test
    public void testAtFirst() {
        assertEquals("he", atFirst("hello"));
        assertEquals("hi", atFirst("hi"));
        assertEquals("h@", atFirst("h"));
        assertEquals("@@", atFirst(""));
        assertEquals("ki", atFirst("kitten"));
        assertEquals("ja", atFirst("java"));
        assertEquals("j@", atFirst("j"));
    }


}
