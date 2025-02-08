package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeaParty {

    public static int teaParty(int tea, int candy) {

        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= candy * 2 || candy >= tea * 2) {
            return 2;
        } else {
            return 1;
        }

    }
    @Test
    public void testTeaParty() {
        assertEquals(1, teaParty(6, 8));
        assertEquals(0, teaParty(3, 8));
        assertEquals(2, teaParty(20, 6));
        assertEquals(2, teaParty(12, 6));
        assertEquals(1, teaParty(11, 6));
        assertEquals(0, teaParty(11, 4));
        assertEquals(0, teaParty(4, 5));
        assertEquals(1, teaParty(5, 5));
        assertEquals(1, teaParty(6, 6));
        assertEquals(2, teaParty(5, 10));
        assertEquals(1, teaParty(5, 9));
        assertEquals(0, teaParty(10, 4));
        assertEquals(2, teaParty(10, 20));
    }

}
