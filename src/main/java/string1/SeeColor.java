package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeeColor {

    public static String seeColor(String str){
        if(str.startsWith("red")){
            return "red";
        }else if(str.startsWith("blue")){
            return "blue";
        }else{
            return "";
        }
    }

    @Test
    public void testSeeColor() {
        assertEquals("red", seeColor("redxx"));
        assertEquals("", seeColor("xxred"));
        assertEquals("blue", seeColor("blueTimes"));
        assertEquals("", seeColor("NoColor"));
        assertEquals("red", seeColor("red"));
        assertEquals("", seeColor("re"));
        assertEquals("", seeColor("blu"));
        assertEquals("blue", seeColor("blue"));
        assertEquals("", seeColor("a"));
        assertEquals("", seeColor(""));
        assertEquals("", seeColor("xyzred"));
    }






}
