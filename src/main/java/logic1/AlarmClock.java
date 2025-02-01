package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlarmClock {

    public static String alarmClock(int day, boolean vacation) {
        boolean weekDay = (day == 1 || day == 2 || day == 3 ||
                day == 4 || day == 5);

        boolean weekEnd = (day == 0 || day == 6);

        if (weekDay && !vacation) {
            return "7:00";
        } else if (weekEnd && !vacation) {
            return "10:00";
        } else if (weekDay && vacation) {
            return "10:00";
        } else {
            return "off";
        }
    }

    @Test
    void testAlarmClock() {
        assertEquals("7:00", AlarmClock.alarmClock(1, false));
        assertEquals("7:00", AlarmClock.alarmClock(5, false));
        assertEquals("10:00", AlarmClock.alarmClock(0, false));
        assertEquals("10:00", AlarmClock.alarmClock(6, false));
        assertEquals("off", AlarmClock.alarmClock(0, true));
        assertEquals("off", AlarmClock.alarmClock(6, true));
        assertEquals("10:00", AlarmClock.alarmClock(1, true));
        assertEquals("10:00", AlarmClock.alarmClock(3, true));
        assertEquals("10:00", AlarmClock.alarmClock(5, true));
    }


}
