package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DelDel {

    public static String delDel(String str) {
        if (str.length() > 3 &&
                str.substring(1, 4).equals("del")) {
            String front = str.substring(0, 1);
            String end = str.substring(4);
            return front + end;
        }

        return str;
    }

    @Test
    void testDelDel() {
        assertEquals("abc", DelDel.delDel("adelbc"));
        assertEquals("aHello", DelDel.delDel("adelHello"));
        assertEquals("adedbc", DelDel.delDel("adedbc"));
        assertEquals("abcdel", DelDel.delDel("abcdel"));
        assertEquals("add", DelDel.delDel("add"));
        assertEquals("ad", DelDel.delDel("ad"));
        assertEquals("a", DelDel.delDel("a"));
        assertEquals("", DelDel.delDel(""));
        assertEquals("del", DelDel.delDel("del"));
        assertEquals("a", DelDel.delDel("adel"));
        assertEquals("aadelbb", DelDel.delDel("aadelbb"));
    }

}
