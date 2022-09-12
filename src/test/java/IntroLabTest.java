/*
 * This file contains JUnit test cases for IntroLab.java
 *
 * Complete the TO-DO in this file!
 */

import org.junit.*;

import static org.junit.Assert.*;

public class IntroLabTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 10)
    public void testExampleStudent() {
        String expected = "Hello! My name is Stu Dent! " +
                "I like cats more than dogs! Welcome to CSC207!";
        String actual = IntroLab.exampleStudent();
        assertEquals(expected, actual);
    }

    @Test(timeout = 10)
    public void testJiang909() {
        String expected = "Hello there! My name is Chris Wangzheng Jiang! " +
                "I like cats more than dogs! I love Computer Science and Math!";
        String actual = IntroLab.jiang909();
        assertEquals(expected, actual);
    }
}
