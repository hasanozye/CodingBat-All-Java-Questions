package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtraEnd {

    public static String extraEnd(String str) {
        String last = str.substring(str.length() - 2);

        return last + last + last;
    }

    @Test
    void testExtraEnd() {
        assertEquals("lololo", ExtraEnd.extraEnd("Hello"));
        assertEquals("ababab", ExtraEnd.extraEnd("ab"));
        assertEquals("HiHiHi", ExtraEnd.extraEnd("Hi"));
        assertEquals("dydydy", ExtraEnd.extraEnd("Candy"));
        assertEquals("dedede", ExtraEnd.extraEnd("Code"));
    }


}
