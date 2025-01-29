package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstHalf {

    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }


    @Test
    void testFirstHalf() {
        assertEquals("Woo", FirstHalf.firstHalf("WooHoo"));
        assertEquals("Hello", FirstHalf.firstHalf("HelloThere"));
        assertEquals("abc", FirstHalf.firstHalf("abcdef"));
        assertEquals("a", FirstHalf.firstHalf("ab"));
        assertEquals("", FirstHalf.firstHalf(""));
        assertEquals("01234", FirstHalf.firstHalf("0123456789"));
        assertEquals("kit", FirstHalf.firstHalf("kitten"));
    }


}
