package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Without2 {

    public static String without2(String str) {

        if (str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2))) {

            return str.substring(2);

        } else {

            return str;

        }

    }

    @Test
    public void testWithout2() {
        assertEquals("lloHe", without2("HelloHe"));
        assertEquals("HelloHi", without2("HelloHi"));
        assertEquals("", without2("Hi"));
        assertEquals("Chocolate", without2("Chocolate"));
        assertEquals("x", without2("xxx"));
        assertEquals("", without2("xx"));
        assertEquals("x", without2("x"));
        assertEquals("", without2(""));
        assertEquals("Fruits", without2("Fruits"));
    }


}
