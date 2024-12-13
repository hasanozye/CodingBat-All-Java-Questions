package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EveryNth {

    public static String everyNth(String str, int n) {
        String result = "";


        for (int i = 0; i < str.length(); i += n) {
            result += str.charAt(i);
        }
        return result;
    }

    @Test
    void testEveryNth() {
        assertEquals("Mrce", EveryNth.everyNth("Miracle", 2));
        assertEquals("aceg", EveryNth.everyNth("abcdefg", 2));
        assertEquals("adg", EveryNth.everyNth("abcdefg", 3));
        assertEquals("Cca", EveryNth.everyNth("Chocolate", 3));
        assertEquals("Ccas", EveryNth.everyNth("Chocolates", 3));
        assertEquals("Coe", EveryNth.everyNth("Chocolates", 4));
        assertEquals("C", EveryNth.everyNth("Chocolates", 100));
    }

}
