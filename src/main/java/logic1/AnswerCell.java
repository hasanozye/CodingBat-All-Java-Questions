package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnswerCell {

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

        if(isAsleep){
            return false;
        }else if(isMom){
            return true;
        }else if(isMorning){
            return false;
        }else{
            return true;
        }

    }

    @Test
    public void testAnswerCell() {
        assertTrue(answerCell(false, false, false));
        assertFalse(answerCell(false, false, true));
        assertFalse(answerCell(true, false, false));
        assertTrue(answerCell(true, true, false));
        assertTrue(answerCell(false, true, false));
        assertFalse(answerCell(true, true, true));
    }


}
