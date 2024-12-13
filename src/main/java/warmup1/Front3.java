package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Front3 {

    public static String front3(String str) {
        if (str.length() >= 3) {
            String front = str.substring(0, 3);
            return front + front + front;
        }
        return str + str + str;

    }


    @Test
    void testFront3() {
        assertEquals("JavJavJav", Front3.front3("Java"));
        assertEquals("ChoChoCho", Front3.front3("Chocolate"));
        assertEquals("abcabcabc", Front3.front3("abc"));
        assertEquals("abcabcabc", Front3.front3("abcXYZ"));
        assertEquals("ababab", Front3.front3("ab"));
        assertEquals("aaa", Front3.front3("a"));
        assertEquals("", Front3.front3(""));
    }


}
