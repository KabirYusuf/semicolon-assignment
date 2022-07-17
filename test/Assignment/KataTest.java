package Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void addTest(){
        Kata kata = new Kata();
        assertEquals(15, kata.add(5,5,5));
    }


    @Test
    public void price(){
        Kata kata = new Kata();
        assertEquals(6000,kata.price(3));
    }

}
