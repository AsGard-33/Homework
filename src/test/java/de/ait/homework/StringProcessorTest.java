package de.ait.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringProcessorTest {
    private StringProcessor stringProcessor;
    @BeforeEach
    public void setUp(){
        stringProcessor = new StringProcessor();
    }
    @Test
    public void testConcatenateTwoString(){
        assertEquals("velosiped",stringProcessor.concatenate("velo","siped"));
    }
    @Test
    public void testGetLengthEmptyString() {
        assertEquals(0, stringProcessor.getLength(""));
    }

    @Test
    public void testGetLengthNonEmptyString() {
        assertEquals(13,stringProcessor.getLength("Hello, World!"));
    }
    @Test
    public void testReverseMirrorString(){
        assertEquals("vorazaN",stringProcessor.reverse("Nazarov"));
    }
    @Test
    public void testIsPalindromeTrue(){
        assertTrue(stringProcessor.isPalindrome("racecar"));
    }
    @Test
    public void testIsPalindromeFalse(){
        assertFalse(stringProcessor.isPalindrome("privet"));
    }
}

