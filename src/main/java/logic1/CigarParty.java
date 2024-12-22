package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CigarParty {

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return (cigars >= 40);
        } else {
            return (cigars >= 40 && cigars <= 60);
        }


    }


    @Test
    void testCigarParty() {
        assertFalse(CigarParty.cigarParty(30, false));
        assertTrue(CigarParty.cigarParty(50, true));
        assertTrue(CigarParty.cigarParty(70, true));
        assertFalse(CigarParty.cigarParty(30, true));
        assertTrue(CigarParty.cigarParty(50, true));
        assertTrue(CigarParty.cigarParty(60, false));
        assertFalse(CigarParty.cigarParty(61, false));
        assertTrue(CigarParty.cigarParty(40, false));
        assertFalse(CigarParty.cigarParty(39, false));
        assertTrue(CigarParty.cigarParty(40, true));
        assertFalse(CigarParty.cigarParty(39, true));
    }


}
