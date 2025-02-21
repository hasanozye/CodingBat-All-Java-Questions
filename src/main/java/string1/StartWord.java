package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StartWord {

    public static String startWord(String str, String word) {

        if (str.isEmpty() || word.length() > str.length()) return "";


        if (str.substring(1, word.length()).equals(word.substring(1))) {

            return str.substring(0, word.length());
        } else {
            return "";
        }


    }

    @Test
    public void testStartWord() {
        assertEquals("hi", startWord("hippo", "hi"));
        assertEquals("hip", startWord("hippo", "xip"));
        assertEquals("h", startWord("hippo", "i"));
        assertEquals("", startWord("hippo", "ix"));
        assertEquals("", startWord("h", "ix"));
        assertEquals("", startWord("", "i"));
        assertEquals("hi", startWord("hip", "zi"));
        assertEquals("hip", startWord("hip", "zip"));
        assertEquals("", startWord("hip", "zig"));
        assertEquals("h", startWord("h", "z"));
        assertEquals("hippo", startWord("hippo", "xippo"));
        assertEquals("", startWord("hippo", "xyz"));
        assertEquals("hip", startWord("hippo", "hip"));
        assertEquals("kit", startWord("kitten", "cit"));
        assertEquals("kit", startWord("kit", "cit"));
    }


}
