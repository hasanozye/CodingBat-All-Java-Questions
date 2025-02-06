package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NTwice {

    public static String nTwice(String str, int n) {

        String first = str.substring(0, n);
        String last = str.substring(str.length() - n);

        return first + last;
    }


    @Test
    public void testNTwice() {
        assertEquals("Helo", nTwice("Hello", 2));
        assertEquals("Choate", nTwice("Chocolate", 3));
        assertEquals("Ce", nTwice("Chocolate", 1));
        assertEquals("", nTwice("Chocolate", 0));
        assertEquals("Hellello", nTwice("Hello", 4));
        assertEquals("CodeCode", nTwice("Code", 4));
        assertEquals("Code", nTwice("Code", 2));
    }


}
