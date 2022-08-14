package Assignment.DataStructure.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    List list;
    @BeforeEach
    void setUp(){
        list = new ArrayList();
    }

    @Test
    public void testThatElementsCanBeAddedToArrayList(){
        list.add("Book");
        list.add("Book");
        list.add("Book");
        list.add("Book");
    }

    @Test
    public void testToGetElementByIndexAfterAddingItems(){
        list.add("Book");
        list.add("spoon");
        list.add("shoe");
        list.add("pen");

        assertEquals("shoe",list.get(2));
    }

    @Test
    public void testToShowThatListIsEmptyWhenNoItemIsAdded(){
        assertTrue(list.isEmpty());
    }

    @Test
    public void testToShowThatListIsNotEmptyItemIsAdded(){
        list.add("Book");
        assertFalse(list.isEmpty());
    }

    @Test
    public void testThatListDoesNotContainElementThatIsNotAddedToIt(){
        list.add("Book");
        assertFalse(list.contains("pen"));
    }

    @Test
    public void testThatListContainsElementsAddedToIt(){
        list.add("Book");
        assertTrue(list.contains("Book"));
    }

    @Test
    public void testToGetTheSizeOfList(){
        list.add("Laptop");
        list.add("Book");
        assertEquals(2,list.size());
    }

    @Test
    public void testToShowThatXYIsAddedToList_SizeOfListIsZeroWhenListIsCleared(){
        list.add("Laptop");
        list.add("Book");
        list.clear();
        assertEquals(0,list.size());
    }

    @Test
    public void testToAddAnElementToAnIndexWhereAnElementAlreadyExists(){
        list.add("Laptop");
        list.add("Book");
        list.add("Pen",1);
        assertEquals("Pen",list.get(1));
    }

    @Test
    public void testToRemoveElementAtASpecifiedIndex(){
        list.add("Laptop");
        list.add("Book");
        list.add("Bread");
        list.remove(1);
        assertEquals("Bread",list.get(1));
    }

    @Test
    public void testToRemoveFirstElementExistingInListHavingSameNameWithTheSpecifiedElement(){
        list.add("Laptop");
        list.add("Book");
        list.add("Bread");
        list.remove("Laptop");
        assertEquals("Book",list.get(0));
    }

}