package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NonStart {

    public static String nonStart(String a, String b) {

        return a.substring(1) + b.substring(1);

    }


    @Test
    void testNonStart() {
        assertEquals("ellohere", NonStart.nonStart("Hello", "There"));
        assertEquals("avaode", NonStart.nonStart("java", "code"));
        assertEquals("hotlava", NonStart.nonStart("shotl", "java"));
        assertEquals("by", NonStart.nonStart("ab", "xy"));
        assertEquals("b", NonStart.nonStart("ab", "x"));
        assertEquals("c", NonStart.nonStart("x", "ac"));
        assertEquals("", NonStart.nonStart("a", "x"));
        assertEquals("itat", NonStart.nonStart("kit", "kat"));
        assertEquals("artart", NonStart.nonStart("mart", "dart"));
    }


}
