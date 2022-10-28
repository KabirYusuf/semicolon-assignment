package assignments.airCondition;

import assignment.airCondition.AirCondition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionTest {
    private AirCondition airCondition;

    @BeforeEach
    void setUp(){
        airCondition = new AirCondition();
    }

    @Test
    public void ACCanBeTurnedOnTest(){
        assertFalse(airCondition.isOn());
        airCondition.turnOn();
        assertTrue(airCondition.isOn());
    }

    @Test
    public void ACCanBeTurnedOffTest(){
        airCondition.turnOn();
        airCondition.turnOff();
        assertFalse(airCondition.isOn());
    }
    @Test
    public void ACInitialTemperatureIsSixteenTest(){
        airCondition.turnOn();
        assertEquals(16, airCondition.getTemperature());
    }
    @Test
    public void ACTemperatureCanIncreaseTest(){
        airCondition.turnOn();
        airCondition.increaseTemperature();
        assertEquals(17, airCondition.getTemperature());
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();
        assertEquals(19, airCondition.getTemperature());
    }

    @Test
    public void ACTemperatureWillNotIncreaseWhenOffTest(){
        airCondition.increaseTemperature();
        assertNotEquals(17, airCondition.getTemperature());
    }

    @Test
    public void ACTemperatureCantIncreaseAboveThirty(){
        airCondition.turnOn();
        for (int i = 0; i < 13; i++) {
            airCondition.increaseTemperature();
        }
        assertEquals(29, airCondition.getTemperature());
        airCondition.increaseTemperature();
        assertEquals(30, airCondition.getTemperature());
        airCondition.increaseTemperature();
        assertEquals(30, airCondition.getTemperature());
    }
    @Test
    public void ACTemperatureISSameValueItWasBeforeItWasTurnedOffWhenTurnedOn(){
        airCondition.turnOn();
        for (int i = 0; i < 10; i++) {
            airCondition.increaseTemperature();
        }
        assertEquals(26, airCondition.getTemperature());
        airCondition.turnOff();
        airCondition.increaseTemperature();
        assertNotEquals(27, airCondition.getTemperature());
        airCondition.turnOn();
        assertEquals(26, airCondition.getTemperature());
    }

    @Test
    public void ACTemperatureCanDecreaseTest(){
        airCondition.turnOn();
        for (int i = 0; i < 4; i++) {
            airCondition.increaseTemperature();
        }
        assertEquals(20, airCondition.getTemperature());
        airCondition.decreaseTemperature();
        assertEquals(19, airCondition.getTemperature());
    }
    @Test
    public void ACTemperatureCantReduceWhenTurnedOff(){
        airCondition.decreaseTemperature();
        assertNotEquals(15, airCondition.getTemperature());
    }

    @Test
    public void ACTemperatureCantBeDecreasedBelowSixteen(){
        airCondition.turnOn();
        airCondition.decreaseTemperature();
        assertEquals(16, airCondition.getTemperature());
    }


}