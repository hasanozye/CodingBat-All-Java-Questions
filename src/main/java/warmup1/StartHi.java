package warmup1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StartHi {

    public static boolean startHi(String str) {
        boolean flag = false;

        if (str.length() >= 2 && str.substring(0, 2).equals("hi")) {

            flag = true;

        }
        return flag;
    }


    @Test
    void testStartHi() {
        // Mevcut test vakaları
        assertTrue(StartHi.startHi("hi there"));
        assertTrue(StartHi.startHi("hi"));
        assertFalse(StartHi.startHi("hello hi"));
        assertFalse(StartHi.startHi("he"));
        assertFalse(StartHi.startHi("h"));
        assertFalse(StartHi.startHi(""));
        assertFalse(StartHi.startHi("ho hi"));
        assertTrue(StartHi.startHi("hi ho"));

        // Ekstra test vakaları
        assertTrue(StartHi.startHi("hi123"));
        assertFalse(StartHi.startHi(" Hi"));
    }
}
