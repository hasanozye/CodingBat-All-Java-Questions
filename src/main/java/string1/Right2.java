package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Right2 {

    public static String right2(String str) {
        String last = str.substring(str.length() - 2);
        String first = str.substring(0, str.length() - 2);
        return last + first;
    }



    @Test
    public void testRight2() {
        assertEquals("loHel", right2("Hello"));
        assertEquals("vaja", right2("java"));
        assertEquals("Hi", right2("Hi"));
        assertEquals("deco", right2("code"));
        assertEquals("atc", right2("cat"));
        assertEquals("45123", right2("12345"));
    }

}
