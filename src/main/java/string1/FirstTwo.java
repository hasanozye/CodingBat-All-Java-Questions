package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTwo {

    public static String firstTwo(String str) {

        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }

    }

    @Test
    void testFirstTwo() {
        assertEquals("He", FirstTwo.firstTwo("Hello"));
        assertEquals("ab", FirstTwo.firstTwo("abcdefg"));
        assertEquals("ab", FirstTwo.firstTwo("ab"));
        assertEquals("a", FirstTwo.firstTwo("a"));
        assertEquals("", FirstTwo.firstTwo(""));
        assertEquals("Ki", FirstTwo.firstTwo("Kitten"));
        assertEquals("hi", FirstTwo.firstTwo("hi"));
        assertEquals("hi", FirstTwo.firstTwo("hiya"));
    }


}
