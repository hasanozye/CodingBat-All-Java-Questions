package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeFront {

    public static String deFront(String str) {

        if (str.isEmpty()) {
            return "";
        } else if (str.length() >= 2) {

            boolean isAFirst = str.charAt(0) == 'a';
            boolean isBSecond = str.charAt(1) == 'b';

            if (isAFirst && isBSecond) {
                return str;
            } else if (isAFirst) {
                return str.charAt(0) + str.substring(2);
            } else if (isBSecond) {
                return str.substring(1);
            } else {
                return str.substring(2);
            }


        } else {
            return str.charAt(0) == 'a' ? "a" : "";
        }

        /*
        if (str.isEmpty()) return ""; // Boş string durumu

    String result = "";

    if (str.charAt(0) == 'a') result += "a"; // İlk harf 'a' ise ekle
    if (str.length() > 1 && str.charAt(1) == 'b') result += "b"; // İkinci harf 'b' ise ekle

    if (str.length() > 2) result += str.substring(2); // Geri kalan kısmı ekle

    return result;
         */

    }

    @Test
    public void testDeFront() {
        assertEquals("llo", deFront("Hello"));
        assertEquals("va", deFront("java"));
        assertEquals("aay", deFront("away"));
        assertEquals("ay", deFront("axy"));
        assertEquals("abc", deFront("abc"));
        assertEquals("by", deFront("xby"));
        assertEquals("ab", deFront("ab"));
        assertEquals("a", deFront("ax"));
        assertEquals("ab", deFront("axb"));
        assertEquals("aa", deFront("aaa"));
        assertEquals("bc", deFront("xbc"));
        assertEquals("bb", deFront("bbb"));
        assertEquals("zz", deFront("bazz"));
        assertEquals("", deFront("ba"));
        assertEquals("abxyz", deFront("abxyz"));
        assertEquals("", deFront("hi"));
        assertEquals("s", deFront("his"));
        assertEquals("", deFront("xz"));
        assertEquals("z", deFront("zzz"));
    }



}
