package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzString2 {

    public static String fizzString2(int n){

        boolean isDivisableBy3 = n % 3 == 0;
        boolean isDivisableBy5 = n % 5 == 0;


        if(isDivisableBy3 && isDivisableBy5){
            return "FizzBuzz!";
        }else if(isDivisableBy5){
            return "Buzz!";
        }else if(isDivisableBy3){
            return "Fizz!";
        }else {
            return n + "!";
        }
    }
    @Test
    public void testFizzString2() {
        assertEquals("1!", fizzString2(1));
        assertEquals("2!", fizzString2(2));
        assertEquals("Fizz!", fizzString2(3));
        assertEquals("4!", fizzString2(4));
        assertEquals("Buzz!", fizzString2(5));
        assertEquals("Fizz!", fizzString2(6));
        assertEquals("7!", fizzString2(7));
        assertEquals("8!", fizzString2(8));
        assertEquals("Fizz!", fizzString2(9));
        assertEquals("FizzBuzz!", fizzString2(15));
        assertEquals("16!", fizzString2(16));
        assertEquals("Fizz!", fizzString2(18));
        assertEquals("19!", fizzString2(19));
        assertEquals("Fizz!", fizzString2(21));
        assertEquals("44!", fizzString2(44));
        assertEquals("FizzBuzz!", fizzString2(45));
        assertEquals("Buzz!", fizzString2(100));
    }


}
