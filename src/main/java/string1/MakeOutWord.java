package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeOutWord {

    public static String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2);
    }


    @Test
    void testMakeOutWord() {
        assertEquals("<<Yay>>", MakeOutWord.makeOutWord("<<>>", "Yay"));
        assertEquals("<<WooHoo>>", MakeOutWord.makeOutWord("<<>>", "WooHoo"));
        assertEquals("[[word]]", MakeOutWord.makeOutWord("[[]]", "word"));
        assertEquals("HHHellooo", MakeOutWord.makeOutWord("HHoo", "Hello"));
        assertEquals("abYAYyz", MakeOutWord.makeOutWord("abyz", "YAY"));
    }


}
