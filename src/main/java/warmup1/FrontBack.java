package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrontBack {

    public static String frontBack(String str) {
        if (str.length() > 1) {
            String lastChar = str.substring(str.length() - 1);
            String firstChar = str.substring(0, 1);
            String mid = str.substring(1, str.length() - 1);
            return lastChar + mid + firstChar;
        }
        return str;
    }


    @Test
    void testFrontBack() {
            assertEquals("eodc", FrontBack.frontBack("code"));
            assertEquals("a", FrontBack.frontBack("a"));
            assertEquals("ba", FrontBack.frontBack("ab"));
            assertEquals("cba", FrontBack.frontBack("abc"));
            assertEquals("", FrontBack.frontBack(""));
            assertEquals("ehocolatC", FrontBack.frontBack("Chocolate"));
            assertEquals("Java", FrontBack.frontBack("aavJ"));
            assertEquals("oellh", FrontBack.frontBack("hello"));
        }

    }
