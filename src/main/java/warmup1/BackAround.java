package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackAround {

    public static String backAround(String str) {

        String lastStrCase = str.substring(str.length() - 1);

        return lastStrCase + str + lastStrCase;
    }

    @Test
    void testBackAround() {
        assertEquals("tcatt", BackAround.backAround("cat"));
        assertEquals("oHelloo", BackAround.backAround("Hello"));
        assertEquals("aaa", BackAround.backAround("a"));
        assertEquals("cabcc", BackAround.backAround("abc"));
        assertEquals("dreadd", BackAround.backAround("read"));
        assertEquals("obooo", BackAround.backAround("boo"));
        assertEquals("zzzz", BackAround.backAround("zz"));
        assertEquals("999", BackAround.backAround("9"));
        assertEquals("ttestt", BackAround.backAround("test"));
        assertEquals("aabaa", BackAround.backAround("aba"));
    }


}
