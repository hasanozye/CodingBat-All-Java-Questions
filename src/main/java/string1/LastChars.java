package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LastChars {

    public static String lastChars(String a, String b) {

        String first = a.length() > 0 ? a.substring(0, 1) : "@";
        String last = b.length() > 0 ? b.substring(b.length() - 1) : "@";

        return first + last;
    }

    @Test
    public void testLastChars() {
        assertEquals("ls", lastChars("last", "chars"));
        assertEquals("ya", lastChars("yo", "java"));
        assertEquals("h@", lastChars("hi", ""));
        assertEquals("@o", lastChars("", "hello"));
        assertEquals("@@", lastChars("", ""));
        assertEquals("ki", lastChars("kitten", "hi"));
        assertEquals("kp", lastChars("k", "zip"));
        assertEquals("k@", lastChars("kitten", ""));
        assertEquals("kp", lastChars("kitten", "zip"));
    }


}
