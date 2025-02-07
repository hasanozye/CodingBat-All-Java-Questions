package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleThree {

    public static String middleThree(String str) {

        if (str.length() > 3) {
            return str.substring((str.length() / 2) - 1, (str.length() / 2) + 2);
        }else{
            return str;
        }
    }

    @Test
    public void testMiddleThree() {
        assertEquals("and", middleThree("Candy"));
        assertEquals("and", middleThree("and"));
        assertEquals("lvi", middleThree("solving"));
        assertEquals("yet", middleThree("Hi yet Hi"));
        assertEquals("yet", middleThree("java yet java"));
        assertEquals("col", middleThree("Chocolate"));
        assertEquals("xyz", middleThree("XabcxyzabcX"));
    }



}
