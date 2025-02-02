package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Left2 {


    public static String left2(String str) {

        String left = str.substring(2);

        return left + str.substring(0, 2);
    }

    @Test
    void testLeft2() {
        assertEquals("lloHe", Left2.left2("Hello"));
        assertEquals("vaja", Left2.left2("java"));
        assertEquals("Hi", Left2.left2("Hi"));
        assertEquals("deco", Left2.left2("code"));
        assertEquals("tca", Left2.left2("cat"));
        assertEquals("34512", Left2.left2("12345"));
        assertEquals("ocolateCh", Left2.left2("Chocolate"));
        assertEquals("icksbr", Left2.left2("bricks"));
    }


}
