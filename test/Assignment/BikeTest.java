package Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    Bike gearSpeed;
    @BeforeEach
    public void setUp(){
        gearSpeed = new Bike();
    }
    @Test
    void testThatObjectExist(){
        assertNotNull(gearSpeed);
    }
    @Test
    public void testIfBikeIsOn(){
        //when bike is off
        gearSpeed.setOff();
        gearSpeed.setOn();
        //check if bike is on/off
        assertTrue(gearSpeed.getOn());
    }
    @Test
    public void testIfBikeIsOff(){
        //when bike is off
        gearSpeed.setOn();
        gearSpeed.setOff();
        // check if bike is on/off
        assertTrue(gearSpeed.getOff());
    }
    @Test
    public void testGearIncrease(){
        //when gear is increased
        gearSpeed.increaseGear();
        gearSpeed.increaseGear();
        gearSpeed.increaseGear();
        gearSpeed.increaseGear();
        gearSpeed.increaseGear();
        gearSpeed.increaseGear();
        gearSpeed.increaseGear();
        //check gear state
        assertEquals(4, gearSpeed.getGear());
    }
    @Test
    public void testGearDecrease(){
        gearSpeed.increaseGear();
        gearSpeed.increaseGear();
        gearSpeed.increaseGear();
        gearSpeed.increaseGear();
        //when gear is decreased
        gearSpeed.decreaseGear();
        //check gear state
        assertEquals(3, gearSpeed.getGear());
    }


    @Test
    public void testSpeedWhileGearIncreases(){
        gearSpeed.increaseGear();



        assertEquals(1,gearSpeed.getGear());
        assertEquals(0,gearSpeed.accelerate());
    }


}
