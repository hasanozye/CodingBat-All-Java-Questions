package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SleepIn {


    public static boolean sleepIn(boolean weekDay, boolean vacation) {
        return !weekDay || vacation;

    }

    @Test
    void testSleepIn() {
        assertTrue(SleepIn.sleepIn(false, false));
        assertFalse(SleepIn.sleepIn(true, false));
        assertTrue(SleepIn.sleepIn(false, true));
        assertTrue(SleepIn.sleepIn(true, true));
        assertFalse(SleepIn.sleepIn(true, true && false));
        assertTrue(SleepIn.sleepIn(false, false || true));
    }

}
