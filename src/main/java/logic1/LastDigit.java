package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LastDigit {

    public static boolean lastDigit(int a, int b, int c){

        int rightMostA = a % 10;
        int rigthMostB = b % 10;
        int rightMostC = c % 10;


        return ((rightMostA == rigthMostB) || (rightMostA ==rightMostC) || (rightMostC==rigthMostB));

    }

    @Test
    public void testLastDigit() {
        assertTrue(lastDigit(23, 19, 13));
        assertFalse(lastDigit(23, 19, 12));
        assertTrue(lastDigit(23, 19, 3));
        assertTrue(lastDigit(23, 19, 39));
        assertFalse(lastDigit(1, 2, 3));
        assertTrue(lastDigit(1, 1, 2));
        assertTrue(lastDigit(1, 2, 2));
        assertFalse(lastDigit(14, 25, 43));
        assertTrue(lastDigit(14, 25, 45));
        assertFalse(lastDigit(248, 106, 1002));
        assertTrue(lastDigit(248, 106, 1008));
        assertTrue(lastDigit(10, 11, 20));
        assertTrue(lastDigit(0, 11, 0));
    }


}
