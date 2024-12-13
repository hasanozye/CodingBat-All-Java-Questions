package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Front22 {

    public static String front22(String str) {

        if (str.length() < 2) {
            return str + str + str;
        }
        String front = str.substring(0, 2);
        return front + str + front;
    }


    @Test
    void testFront22() {
        assertEquals("kikittenki", Front22.front22("kitten"));
        assertEquals("HaHaHa", Front22.front22("Ha"));
        assertEquals("ababcab", Front22.front22("abc"));
        assertEquals("ababab", Front22.front22("ab"));
        assertEquals("aaa", Front22.front22("a"));
        assertEquals("", Front22.front22(""));
        assertEquals("LoLogicLo", Front22.front22("Logic"));
    }


}
