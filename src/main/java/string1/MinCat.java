package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinCat {

    public static String minCat(String a, String b) {

        if (a.length() > b.length()) {

            return a.substring(a.length() - b.length()) + b;

        } else if (b.length() > a.length()) {

            return a + b.substring(b.length() - a.length());

        } else {

            return a + b;

        }

    }


    @Test
    public void testMinCat() {
        assertEquals("loHi", minCat("Hello", "Hi"));
        assertEquals("ellojava", minCat("Hello", "java"));
        assertEquals("javaello", minCat("java", "Hello"));
        assertEquals("cx", minCat("abc", "x"));
        assertEquals("xc", minCat("x", "abc"));
        assertEquals("", minCat("abc", ""));
    }


}
