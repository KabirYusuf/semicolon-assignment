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
    public void newListIsEmptyTest(){
        list = new ArrayList();
        assertTrue(list.isEmpty());
    }
    @Test
    public void addItemListIsEmptyTest(){
        list = new ArrayList();
        list.add("G-String");
        assertFalse(list.isEmpty());
    }
    @Test
    public void addItemIsNotEmpty_SizeIsOneTest(){
        list = new ArrayList();
        list.add("G-String");
        assertFalse(list.isEmpty());
        assertEquals(1,list.size());



    }
    @Test
    public void addItemGetByIndexTest(){
        list.add("A-String");
        String savedItem = list.get(0);
        assertEquals("A-String", savedItem);

    }
    @Test
    public void addXYGetXY(){
        list.add("A-String");
        list.add("G-String");
        assertEquals("A-String",list.get(0));
        assertEquals("G-String",list.get(1));
    }
    @Test
    public void addXYremoveYSizeIsOneTest(){
        list.add("A string");
        list.add("G string");
        list.remove(1);
        assertEquals(1,list.size());

    }

    @Test
    public void addXYremoveYFindByIndexIsNullTest(){
        list.add("A string");
        list.add("G string");
        list.remove(1);
        assertEquals(1,list.size());
        String deleteItem = list.get(1);
        assertNull(deleteItem);
    }

}