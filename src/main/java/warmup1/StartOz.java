package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StartOz {

    public static String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }

        return result;
    }


    @Test
    void testStartOz() {
        assertEquals("oz", StartOz.startOz("ozymandias"));
        assertEquals("z", StartOz.startOz("bzoo"));
        assertEquals("o", StartOz.startOz("oxx"));
        assertEquals("oz", StartOz.startOz("oz"));
        assertEquals("o", StartOz.startOz("ounce"));
        assertEquals("o", StartOz.startOz("o"));
        assertEquals("", StartOz.startOz("abc"));
        assertEquals("", StartOz.startOz(""));
        assertEquals("", StartOz.startOz("zoo"));
        assertEquals("z", StartOz.startOz("aztec"));
        assertEquals("z", StartOz.startOz("zzzz"));
        assertEquals("oz", StartOz.startOz("oznic"));
    }


}
