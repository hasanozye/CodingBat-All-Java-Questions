package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Concat {

    public static String conCat(String a, String b) {


        if (a.length() == 0 || b.length() == 0) {
            return a + b;
        }


        if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
            return a + b.substring(1);
        } else {
            return a + b;
        }

    }

    @Test
    public void testConCat() {
        assertEquals("abcat", conCat("abc", "cat"));
        assertEquals("dogcat", conCat("dog", "cat"));
        assertEquals("abc", conCat("abc", ""));
        assertEquals("cat", conCat("", "cat"));
        assertEquals("pig", conCat("pig", "g"));
        assertEquals("pigdoggy", conCat("pig", "doggy"));
    }



}
