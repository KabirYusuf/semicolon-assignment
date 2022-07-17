package Assignment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {
    @Test
    @DisplayName("For AC is ON")
        public void forAcIsOn(){
        //given that
        AirConditioner sony = new AirConditioner();
        //when
        sony.setOn();
    }

    @Test
    @DisplayName("For AC is OFF")
    public void forAcIsOff(){
        //given that
        AirConditioner sony = new AirConditioner();
        //when
        sony.setOff();
        //check
    }

    @Test
    @DisplayName("For Increase Temperature")
    public void forIncreaseTemperature(){
        //given that
        AirConditioner sony = new AirConditioner();
        sony.setOn();
        sony.increaseTemperature();
        sony.increaseTemperature();


        //check
        assertEquals(30, sony.getTemperature());
    }

    @Test
    @DisplayName("For decrease Temperature")
    public void forDecreaseTemperature(){
        //given that
        AirConditioner sony = new AirConditioner();
        //when
        sony.setOn();
        sony.increaseTemperature();
        sony.decreaseTemperature();


        //check
        assertEquals(20, sony.getTemperature());
    }

    @Test
    @DisplayName("For decrease Temperature below 16")
    public void forDecreaseTemperatureBelowSixteen(){
        //given that
        AirConditioner sony = new AirConditioner();
        //when
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.decreaseTemperature();
        sony.decreaseTemperature();
        sony.decreaseTemperature();
        sony.decreaseTemperature();
        sony.decreaseTemperature();

        //check
        assertEquals(16, sony.getTemperature());
    }
    @Test
    @DisplayName("For increase Temperature beyond 30")
    public void forIncreaseTemperatureBeyondThirty(){
        //given that
        AirConditioner sony = new AirConditioner();
        //when
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();

        //check
        assertEquals( 30,sony.getTemperature());
    }
}