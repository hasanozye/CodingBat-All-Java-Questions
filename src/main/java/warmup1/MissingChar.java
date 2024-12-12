package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingChar {

    public static String missingChar(String str, int n) {

        String front = str.substring(0, n);
        String back = str.substring(n + 1);

        return front + back;

    }

    @Test
    void testMissingChar() {
        assertEquals("ktten", MissingChar.missingChar("kitten", 1));
        assertEquals("itten", MissingChar.missingChar("kitten", 0));
        assertEquals("kittn", MissingChar.missingChar("kitten", 4));
        assertEquals("i", MissingChar.missingChar("Hi", 0));
        assertEquals("H", MissingChar.missingChar("Hi", 1));
        assertEquals("ode", MissingChar.missingChar("code", 0));
        assertEquals("cde", MissingChar.missingChar("code", 1));
        assertEquals("coe", MissingChar.missingChar("code", 2));
        assertEquals("cod", MissingChar.missingChar("code", 3));
        assertEquals("chocolat", MissingChar.missingChar("chocolate", 8));
    }


}
