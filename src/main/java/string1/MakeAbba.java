package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeAbba {

    public static String makeAbba(String a, String b) {

        return a + b + b + a;

    }

    @Test
    void testMakeAbba() {
        assertEquals("HiByeByeHi", MakeAbba.makeAbba("Hi", "Bye"));
        assertEquals("YoAliceAliceYo", MakeAbba.makeAbba("Yo", "Alice"));
        assertEquals("WhatUpUpWhat", MakeAbba.makeAbba("What", "Up"));
        assertEquals("aaabbbbbbaaa", MakeAbba.makeAbba("aaa", "bbb"));
        assertEquals("xyyx", MakeAbba.makeAbba("x", "y"));
        assertEquals("xx", MakeAbba.makeAbba("x", ""));
        assertEquals("yy", MakeAbba.makeAbba("", "y"));
        assertEquals("BoYaYaBo", MakeAbba.makeAbba("Bo", "Ya"));
        assertEquals("YaYaYaYa", MakeAbba.makeAbba("Ya", "Ya"));
    }


}
