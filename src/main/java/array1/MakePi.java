package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MakePi {

    public static int[] makePi() {
        return new int[]{3, 1, 4};
    }

    @Test
    void testMakePi() {
        assertArrayEquals(new int[]{3, 1, 4}, MakePi.makePi());
    }


}
