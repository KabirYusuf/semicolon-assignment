package assignments.bike;


import assignment.bike.Bike;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike bike;
    @BeforeEach
    void setup(){
        bike = new Bike();
    }
    @Test
    public void testThatBikeCanBeTurnedOn(){
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
    }
    @Test
    public void testThatBikeCanBeTurnedOff(){
        bike.turnOn();
        bike.turnOff();
        assertFalse(bike.isOn());
    }
    @Test
    public void bikeCanBeAcceleratedOnGearOneTest(){
        bike.turnOn();
        assertEquals(0, bike.getSpeed());
        assertEquals(1, bike.getGear());
        bike.increaseSpeed();
        assertEquals(1, bike.getSpeed());
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(4,bike.getSpeed());
    }
    @Test
    public void testBikeWillNotAccelerateWhenOffTest(){
        assertFalse(bike.isOn());
        assertEquals(0, bike.getSpeed());

        bike.increaseSpeed();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void bikeCanChangeFromGearOneToGearTwoAutomatically(){
        bike.turnOn();
        for (int i = 0; i < 20; i++) {
            bike.increaseSpeed();
        }

        assertEquals(20, bike.getSpeed());
        bike.increaseSpeed();
        assertEquals(2, bike.getGear());
        assertEquals(21, bike.getSpeed());
    }

    @Test
    public void bikeCanAccelerateOnGearTwoTest(){
        bike.turnOn();
        for (int i = 0; i < 21; i++) {
            bike.increaseSpeed();
        }
        assertEquals(2, bike.getGear());
        assertEquals(21, bike.getSpeed());
        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(25, bike.getSpeed());
        assertEquals(2, bike.getGear());

    }

    @Test
    public void bikeCanChangeFromGearTwoToGearThree(){
        bike.turnOn();
        for (int i = 0; i < 25; i++) {
            bike.increaseSpeed();
        }
        assertEquals(29,bike.getSpeed());
        assertEquals(2, bike.getGear());
        bike.increaseSpeed();
        assertEquals(3, bike.getGear());
    }

    @Test
    public void BikeCanAccelerateOnGearThreeTest(){
        bike.turnOn();
        for (int i = 0; i < 26; i++) {
            bike.increaseSpeed();
        }

        assertEquals(31, bike.getSpeed());
        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(37, bike.getSpeed());
        assertEquals(3, bike.getGear());
    }
    @Test
    public void testThatBikeCanChangeFromGearThreeToGearFour(){
        bike.turnOn();
        for (int i = 0; i < 29; i++) {
            bike.increaseSpeed();
        }
        assertEquals(40, bike.getSpeed());
        bike.increaseSpeed();
        assertEquals(4, bike.getGear());
    }

    @Test
    public void bikeCanAccelerateOnGearFourTest(){
        bike.turnOn();
        for (int i = 0; i < 30; i++) {
            bike.increaseSpeed();
        }
        assertEquals(43, bike.getSpeed());
        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(51, bike.getSpeed());
    }

    @Test
    public void bikeCanDecelerateOnGearFourTest(){
        bike.turnOn();
        for (int i = 0; i < 32; i++) {
            bike.increaseSpeed();
        }
        assertEquals(51, bike.getSpeed());
        assertEquals(4, bike.getGear());
        bike.decreaseSpeed();

        assertEquals(47, bike.getSpeed());
        assertEquals(4, bike.getGear());
        bike.decreaseSpeed();
        assertEquals(43, bike.getSpeed());
        assertEquals(4, bike.getGear());


    }

    @Test
    public void bikeCanChangeFromGearFourToGearThreeTest(){
        bike.turnOn();
        for (int i = 0; i < 30; i++) {
            bike.increaseSpeed();
        }
        bike.decreaseSpeed();
        assertEquals(39,bike.getSpeed());
        assertEquals(3, bike.getGear());
        bike.decreaseSpeed();
        assertEquals(36,bike.getSpeed());
        assertEquals(3, bike.getGear());
    }

    @Test
    public void bikeCanDecelerateOnGearThree(){
        bike.turnOn();
        for (int i = 0; i < 29; i++) {
            bike.increaseSpeed();
        }
        assertEquals(40, bike.getSpeed());
        for (int i = 0; i < 3; i++) {
            bike.decreaseSpeed();
        }
        assertEquals(3,bike.getGear());
        assertEquals(31, bike.getSpeed());
    }
    @Test
    public void bikeCanChangeFromGearThreeToGearTwo(){
        bike.turnOn();
        for (int i = 0; i < 29; i++) {
            bike.increaseSpeed();
        }
        assertEquals(40, bike.getSpeed());
        assertEquals(3, bike.getGear());
        for (int i = 0; i < 4; i++) {
            bike.decreaseSpeed();
        }
        assertEquals(28, bike.getSpeed());
        assertEquals(2, bike.getGear());
    }

    @Test
    public void bikeCanDecelerateOnGearTwo(){
        bike.turnOn();
        for (int i = 0; i < 25; i++) {
            bike.increaseSpeed();
        }
        assertEquals(29, bike.getSpeed());
        for (int i = 0; i < 3; i++) {
            bike.decreaseSpeed();
        }
        assertEquals(23, bike.getSpeed());
        assertEquals(2, bike.getGear());
    }

    @Test
    public void bikeCanChangeFromGearTwoToGearOneTest(){
        bike.turnOn();
        for (int i = 0; i < 23; i++) {
            bike.increaseSpeed();
        }
        assertEquals(25, bike.getSpeed());
        assertEquals(2, bike.getGear());
        for (int i = 0; i < 3; i++) {
            bike.decreaseSpeed();
        }
        assertEquals(1, bike.getGear());
        assertEquals(19, bike.getSpeed());

    }

    @Test
    public void testThatBikeCanDecelerateOnGearOneTest(){
        bike.turnOn();
        for (int i = 0; i < 20; i++) {
            bike.increaseSpeed();
        }
        assertEquals(20, bike.getSpeed());
        assertEquals(1, bike.getGear());
        for (int i = 0; i < 19; i++) {
            bike.decreaseSpeed();
        }
        assertEquals(1, bike.getSpeed());
    }

    @Test
    public void bikeCanChangeFromGearOneToGearZero(){
        bike.turnOn();
        for (int i = 0; i < 20; i++) {
            bike.increaseSpeed();
        }
        assertEquals(1, bike.getGear());
        assertEquals(20, bike.getSpeed());
        for (int i = 0; i < 20; i++) {
            bike.decreaseSpeed();
        }
        assertEquals(0, bike.getSpeed());
        assertEquals(0, bike.getGear());
    }

    @Test
    public void bikeCantDecelerateWhenOff(){
        for (int i = 0; i < 10; i++) {
            bike.increaseSpeed();
        }
        bike.decreaseSpeed();
        assertEquals(0, bike.getSpeed());

    }

    @Test
    public void bikeSpeedCantGiveANegativeValueWhenDecelerating(){
        bike.turnOn();
        bike.decreaseSpeed();
        assertEquals(0, bike.getSpeed());
        bike.decreaseSpeed();
        assertEquals(0,bike.getSpeed());

    }
    @Test
    public void bikeSpeedDeceleratesRespectively(){
        bike.turnOn();
        for (int i = 0; i < 30; i++) {
            bike.increaseSpeed();
        }
        assertEquals(4, bike.getGear());
        assertEquals(43, bike.getSpeed());
        for (int i = 0; i < 20; i++) {
            bike.decreaseSpeed();
        }
        assertEquals(1, bike.getGear());
        assertEquals(9, bike.getSpeed());
    }


}
