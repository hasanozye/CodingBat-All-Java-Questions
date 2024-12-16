package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloName {

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    @Test
    void testHelloName() {
        assertEquals("Hello Bob!", HelloName.helloName("Bob"));
        assertEquals("Hello Alice!", HelloName.helloName("Alice"));
        assertEquals("Hello X!", HelloName.helloName("X"));
        assertEquals("Hello Dolly!", HelloName.helloName("Dolly"));
        assertEquals("Hello Alpha!", HelloName.helloName("Alpha"));
        assertEquals("Hello Omega!", HelloName.helloName("Omega"));
        assertEquals("Hello Goodbye!", HelloName.helloName("Goodbye"));
        assertEquals("Hello ho ho ho!", HelloName.helloName("ho ho ho"));
        assertEquals("Hello xyz!", HelloName.helloName("xyz"));
        assertEquals("Hello Hello!", HelloName.helloName("Hello"));
    }


}
