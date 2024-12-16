package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeTags {

    public static String makeTags(String tag, String word) {

        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    @Test
    void testMakeTags() {
        assertEquals("<i>Yay</i>", MakeTags.makeTags("i", "Yay"));
        assertEquals("<i>Hello</i>", MakeTags.makeTags("i", "Hello"));
        assertEquals("<cite>Yay</cite>", MakeTags.makeTags("cite", "Yay"));
        assertEquals("<address>here</address>", MakeTags.makeTags("address", "here"));
        assertEquals("<body>Heart</body>", MakeTags.makeTags("body", "Heart"));
        assertEquals("<i>i</i>", MakeTags.makeTags("i", "i"));
        assertEquals("<i></i>", MakeTags.makeTags("i", ""));
    }


}
