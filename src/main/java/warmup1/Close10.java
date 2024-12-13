package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Close10 {

    public static int close10(int a, int b) {
        int absA = Math.abs(10 - a);
        int absB = Math.abs(10 - b);


        if (absB == absA) return 0;

        if (absA < absB) {
            return a;
        } else {
            return b;
        }
    }


    @Test
    void testClose10() {
        assertEquals(8, Close10.close10(8, 13));
        assertEquals(8, Close10.close10(13, 8));
        assertEquals(0, Close10.close10(13, 7));
        assertEquals(0, Close10.close10(7, 13));
        assertEquals(9, Close10.close10(9, 13));
        assertEquals(8, Close10.close10(13, 8));
        assertEquals(10, Close10.close10(10, 12));
        assertEquals(10, Close10.close10(11, 10));
        assertEquals(5, Close10.close10(5, 21));
        assertEquals(0, Close10.close10(0, 20));
        assertEquals(0, Close10.close10(10, 10));
    }

}
