package assignments.array;

import assignment.array.Question;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {
    @Test
    public void testArrayReturnsLargestElement(){
        int [] array = {2,6,1,9,0};
        assertEquals(9, Question.largestElement(array));
    }
    @Test
    public void testArrayDoesNotReturnElementThatIsNotTheLargest(){
        int [] array = {6,43,54,9,3};
        assertNotEquals(43,Question.largestElement(array));
    }

    @Test
    public void testThatArrayElementsArePrintedInReverse(){
        int [] array = {1,2,3,4,5};
        assertArrayEquals(new int[]{5,4,3,2,1},Question.arrayReverse(array));
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
        String value = "madam";
        assertTrue(Question.isPalindrome(value));
    }
    @Test
    public void testArrayReturnsAlternateValues(){
        int [] array1= {1,2,3,4};
        String [] array2 = {"a","b","c","d"};
        assertArrayEquals(new String[]{"a","1","b","2","c","3","d","4"},Question.alternative(array1,array2));
    }
}