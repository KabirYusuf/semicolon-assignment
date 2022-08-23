package Assignment.ArrayAndList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {
    @Test
    public void testArrayReturnsLargestElement(){
        int [] array = {2,6,1,9,0};
        assertEquals(9,Question.largestElement(array));
    }
    @Test
    public void testArrayDoesNotReturnElementThatIsNotTheLargest(){
        int [] array = {6,43,54,9,3};
        assertNotEquals(43,Question.largestElement(array));
    }

    @Test
    public void testThatArrayElementsArePrintedInReverse(){
        int [] array = {1,2,3,4,5};
        assertEquals("[5, 4, 3, 2, 1]",Question.arrayReverse(array));
    }
    @Test
    public void testThatAnArrayContainsAnElement(){
        int [] array = {5,10,3,6};
        assertTrue(Question.isContain(array, 10));
    }
    @Test
    public void testThatArrayDoesNotContainElement(){
        int [] array = {4,3,2,7};
        assertFalse(Question.isContain(array,10));
    }
    @Test
    public void testToPrintNumberAtOddNumberPositions(){
        int [] array = {3,2,1,5,7};
        assertEquals("25",Question.oddPositionNumbers(array));
    }

    @Test
    public void testToPrintNumberAtEvenNumberPositions(){
        int [] array = {3,2,1,5,7};
        assertEquals("317",Question.evenPositionNumbers(array));
    }

    @Test
    public void testThatStringIsAPalindrome(){
        String value = "mom";
        assertTrue(Question.isPalindrome(value));
    }
    @Test
    public void testThatStringIsNotAPalindrome(){
        String value = "mango";
        assertFalse(Question.isPalindrome(value));
    }
}