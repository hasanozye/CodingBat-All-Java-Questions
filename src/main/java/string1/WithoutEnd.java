package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutEnd {

    public static String withoutEnd(String str) {

        return str.substring(1, str.length() - 1);
    }


    @Test
    void testWithoutEnd() {
        assertEquals("ell", WithoutEnd.withoutEnd("Hello"));
        assertEquals("av", WithoutEnd.withoutEnd("java"));
        assertEquals("odin", WithoutEnd.withoutEnd("coding"));
        assertEquals("od", WithoutEnd.withoutEnd("code"));
        assertEquals("", WithoutEnd.withoutEnd("ab"));
        assertEquals("hocolate", WithoutEnd.withoutEnd("Chocolate!"));
        assertEquals("itte", WithoutEnd.withoutEnd("kitten"));
        assertEquals("ooho", WithoutEnd.withoutEnd("woohoo"));
    }


}
