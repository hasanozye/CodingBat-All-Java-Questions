package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzString {

    public static String fizzString(String str){

        boolean isStrStartsWithF = str.startsWith("f");
        boolean isStrEndsWithB = str.endsWith("b");

        if(isStrStartsWithF && isStrEndsWithB) return "FizzBuzz";
        if(isStrStartsWithF) return "Fizz";
        if(isStrEndsWithB) return "Buzz";

        return str;
    }

    @Test
    public void testFizzString() {
        assertEquals("Fizz", fizzString("fig"));
        assertEquals("Buzz", fizzString("dib"));
        assertEquals("FizzBuzz", fizzString("fib"));
        assertEquals("abc", fizzString("abc"));
        assertEquals("Fizz", fizzString("fooo"));
        assertEquals("booo", fizzString("booo"));
        assertEquals("Buzz", fizzString("ooob"));
        assertEquals("FizzBuzz", fizzString("foobb"));
        assertEquals("Fizz", fizzString("f"));
        assertEquals("Buzz", fizzString("b"));
        assertEquals("Buzz", fizzString("abcb"));
        assertEquals("Hello", fizzString("Hello"));
        assertEquals("Buzz", fizzString("Hellob"));
        assertEquals("af", fizzString("af"));
        assertEquals("bf", fizzString("bf"));
        assertEquals("FizzBuzz", fizzString("fb"));
    }


}
