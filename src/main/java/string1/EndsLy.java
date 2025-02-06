package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EndsLy {

    public static boolean endsLy(String str) {

        return str.endsWith("ly");
    }


    @Test
    public void testEndsLy() {
        assertTrue(endsLy("oddly"));
        assertFalse(endsLy("y"));
        assertFalse(endsLy("oddy"));
        assertFalse(endsLy("oddl"));
        assertFalse(endsLy("olydd"));
        assertTrue(endsLy("ly"));
        assertFalse(endsLy(""));
        assertFalse(endsLy("falsey"));
        assertTrue(endsLy("evenly"));
    }


}
