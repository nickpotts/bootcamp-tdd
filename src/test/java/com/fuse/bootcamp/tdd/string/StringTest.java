package com.fuse.bootcamp.tdd.string;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTest {
    // global variables can go here...
    private static IString bcStr;

    @BeforeClass
    public static void initMe() {
        // initialization code can go here...
        bcStr = new BCString();
    }

    @Before
    public void beforeEachTest() {
        // This will be executed before each test
    }

    @After
    public void afterEachTest() {
        // This will be executed after each test");
    }

    @Test
    public void testConcatenation() {
        String str1 = "ham";
        String str2 = "burger";

        assertEquals("hamburger", bcStr.concat(str1, str2));
    }


    @Test
    public void testConcatenationOrder() {
        String str1 = "hot";
        String str2 = "dog";

        assertNotEquals("doghot", bcStr.concat(str1, str2));
    }

    @Test
    public void testReversalGrape() {
        String str = "grape";

        assertEquals("eparg", bcStr.reverse(str));
    }

    @Test
    public void testReversalCherry() {
        String str = "cherry";

        assertEquals("yrrehc", bcStr.reverse(str));
    }

    @Test
    public void testBuggyReversal() {
        String str = "apple";

        assertEquals("elppa", bcStr.reverse(str));
    }


    @Test
    public void testToUpperCase() {
        String str = "orange";

        assertEquals("ORANGE", bcStr.toUpperCase(str));
    }

    @Test
    public void testToLowerCase() {
        String str = "BANANA";

        assertEquals("banana", bcStr.toLowerCase(str));
    }

    @Test
    public void testIsPalindromeTrue() {
        String str = "deleveled";

        assertTrue(bcStr.isPalindrome(str));
    }

    @Test
    public void testIsPalindromeFalse() {
        String str = "strawberry";

        assertFalse(bcStr.isPalindrome(str));
    }
}
