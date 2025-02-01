package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComboString {

    public static String comboString(String a, String b) {

        if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }

    @Test
    void testComboString() {
        assertEquals("hiHellohi", ComboString.comboString("Hello", "hi"));
        assertEquals("hiHellohi", ComboString.comboString("hi", "Hello"));
        assertEquals("baaab", ComboString.comboString("aaa", "b"));
        assertEquals("baaab", ComboString.comboString("b", "aaa"));
        assertEquals("aaa", ComboString.comboString("aaa", ""));
        assertEquals("bb", ComboString.comboString("", "bb"));
        assertEquals("aaa1234aaa", ComboString.comboString("aaa", "1234"));
        assertEquals("bbaaabb", ComboString.comboString("aaa", "bb"));
        assertEquals("abba", ComboString.comboString("a", "bb"));
        assertEquals("abba", ComboString.comboString("bb", "a"));
        assertEquals("abxyzab", ComboString.comboString("xyz", "ab"));
    }

}
