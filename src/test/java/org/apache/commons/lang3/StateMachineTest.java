package org.apache.commons.lang3;

import org.junit.jupiter.api.Test;

import java.nio.charset.Charset;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StateMachineTest {

    @Test
    public void testByteArrayToString() {
        final String expectedString = "262 assignment2";
        byte[] expectedBytes = expectedString.getBytes(Charset.defaultCharset());
        assertEquals(expectedString, StringUtils.toEncodedString(expectedBytes, Charset.defaultCharset()));
    }

    @Test
    public void testByteArrToByteArr() {
        final byte[] array = {10, 11, 12, 13, 14, 15};
        final byte[] leftSubarray = {10, 11, 12, 13};

    }

    @Test
    public void testCharArrToCharArr() {
        final char[] array = {'a', 'b', 'c', 'd', 'e', 'f'};
        final char[] leftSubarray = {'a', 'b', 'c', 'd'};
        assertEquals(Arrays.toString(leftSubarray),Arrays.toString(ArrayUtils.subarray(array, 0, 4)));
    }

    @Test
    public void testCharArrToString() {
        final String expectedString = "abcdef";
        final char[] array = {'a', 'b', 'c', 'd', 'e', 'f'};
        assertEquals(expectedString,StringUtils.valueOf(array));
    }

    @Test
    public void testCharToString() {
        assertEquals("a", CharUtils.toString('a'));
    }

    @Test
    public void testStringToChar() {
        assertEquals('A', CharUtils.toChar("A"));
    }

    @Test
    public void testCharToCharacter() {
        assertEquals(Character.valueOf('a'), CharUtils.toCharacterObject('a'));
    }

    @Test
    public void testCharacterToChar() {
        assertEquals(Character.valueOf('a'), CharUtils.toCharacterObject('a'));
    }

    @Test
    public void testStringtoString() {
        assertEquals("262", StringUtils.trim(" " + "262" + "  "));
    }

    @Test
    public void testStringtoCharacter() {
        assertEquals("262", StringUtils.trim(" " + "262" + "  "));
    }

    @Test
    public void testCharacterToString() {
        assertEquals("A", CharUtils.toString(Character.valueOf('A')));
    }

    @Test
    public void testStringToStringArray() {
        String str = "a.b.. c";
        String[] res = StringUtils.split(str, '.');
        assertEquals(3, res.length);
        assertEquals("a", res[0]);
        assertEquals("b", res[1]);
        assertEquals(" c", res[2]);
    }

    @Test
    public void testStringArraytToString() {
        assertEquals("{pink,blue}", ArrayUtils.toString(new String[]{"pink", "blue"}));
    }



    @Test
    public void testStringArraytToStringArray() {
        final Object[] array = new Object[]{1, 2, 3, "array", "test"};
        assertEquals(Arrays.toString(new String[]{"1", "2", "3", "array", "test"}), Arrays.toString(ArrayUtils.toStringArray(array)));
    }

}
