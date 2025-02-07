package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoChar {

    public static String twoChar(String str, int index) {

        if (!(index + 2 > str.length()) && index > 0) {
            return str.substring(index, index + 2);
        } else {
            return str.substring(0, 2);
        }

    }


    @Test
    public void testTwoChar() {
        assertEquals("ja", twoChar("java", 0));
        assertEquals("va", twoChar("java", 2));
        assertEquals("ja", twoChar("java", 3));
        assertEquals("ja", twoChar("java", 4));
        assertEquals("ja", twoChar("java", -1));
        assertEquals("He", twoChar("Hello", 0));
        assertEquals("el", twoChar("Hello", 1));
        assertEquals("lo", twoChar("Hello", 3));
        assertEquals("He", twoChar("Hello", 9));
        assertEquals("He", twoChar("Hello", 4));
        assertEquals("He", twoChar("Hello", 5));
        assertEquals("He", twoChar("Hello", -7));
        assertEquals("He", twoChar("Hello", -1));
        assertEquals("ya", twoChar("yay", 0));
    }


}
