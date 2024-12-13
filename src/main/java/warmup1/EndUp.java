package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EndUp {

    public static String endUp(String str) {
        if (str.length() < 3) return str.toUpperCase();

        String lastChars = str.substring(str.length() - 3).toUpperCase();
        String firstChars = str.substring(0, str.length() - 3);

        return firstChars + lastChars;
    }


    @Test
    void testEndUp() {
        assertEquals("HeLLO", EndUp.endUp("Hello"));
        assertEquals("hi thERE", EndUp.endUp("hi there"));
        assertEquals("HI", EndUp.endUp("hi"));
        assertEquals("woo HOO", EndUp.endUp("woo hoo"));
        assertEquals("xyZ12", EndUp.endUp("xyz12"));
        assertEquals("X", EndUp.endUp("x"));
        assertEquals("", EndUp.endUp(""));
    }


}
