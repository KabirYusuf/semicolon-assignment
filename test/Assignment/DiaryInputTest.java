package Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryInputTest {

    DiaryInput diary;

    @BeforeEach
    void setUp(){
      diary =  new DiaryInput("My life","i love my life");
    }

    @Test
    public void testSubject(){
//        DiaryInput.setSubject("Duniya");
//        assertEquals("Duniya", DiaryInput.getSubject());
    }

}
