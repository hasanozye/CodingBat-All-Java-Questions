package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringE {

    public static boolean stringE(String str) {
        int count = 0;


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }

        return count <= 3 && count >= 1;
    }


    @Test
    void testStringE() {
        assertTrue(StringE.stringE("Hello"));
        assertTrue(StringE.stringE("Heelle"));
        assertFalse(StringE.stringE("Heelele"));
        assertFalse(StringE.stringE("Hi"));
        assertTrue(StringE.stringE("e"));
        assertFalse(StringE.stringE(""));
    }

}
