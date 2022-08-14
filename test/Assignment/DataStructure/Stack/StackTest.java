package Assignment.DataStructure.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack stack;


    @BeforeEach
    void setUp(){
        stack = new Stack();
    }

    @Test
    public void testThatStackIsEmpty(){
        assertTrue(stack.isEmpty());
    }



    @Test
    public void testToPushAnItemToTheStack(){
        stack.push("Book");
    }

    @Test
    public void testToCheckThatStackIsNotEmptyAfterItemIsPushed(){
        stack.push("Pen");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testToSearchForItemWithItemNameAndPrintItemPosition(){
        stack.push("Pencil");
        stack.push("book");
        stack.search("Pencil");
        stack.search("book");
    }
    @Test
    public void testToPopElementYAfterPushingElementXY(){
        stack.push("Book");
        stack.push("Bag");
        stack.pop();
    }

    @Test
    public void testToShowThatPopMethodReducesTheElementsSizeByOne(){
        stack.pop();
    }

    @Test
    public void testToGetSizeOfElementInsideElementsAfterPushingElementXYZ(){
        stack.push("Book");
        stack.push("Pen");
        stack.push("Phone");
        assertEquals(3,stack.size());
    }

    @Test
    public void testToDisplayLastElementInElementsWhenABCDEIsPushed(){
        stack.push("Belt");
        stack.push("Shoe");
        stack.push("Bread");
        stack.push("Pen");
        stack.push("Book");
        assertEquals("Book",stack.peek());
    }


}