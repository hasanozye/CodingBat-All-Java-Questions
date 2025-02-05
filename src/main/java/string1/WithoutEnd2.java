package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutEnd2 {

    public static String withoutEnd2(String str) {
        return str.length() < 2 ? "" : str.substring(1, str.length() - 1);
    }


    @Test
    public void testWithoutEnd2() {
        assertEquals("ell", withoutEnd2("Hello"));
        assertEquals("b", withoutEnd2("abc"));
        assertEquals("", withoutEnd2("ab"));
        assertEquals("", withoutEnd2("a"));
        assertEquals("", withoutEnd2(""));
        assertEquals("old", withoutEnd2("coldy"));
        assertEquals("ava cod", withoutEnd2("java code"));
    }




}
