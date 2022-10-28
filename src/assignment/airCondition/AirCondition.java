package assignment.airCondition;

public class AirCondition {
    private boolean isOn;

    private int temperature = 16;

    public void turnOn() {
        isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if(isOn)addTemperature();
        if(temperature > 30)temperatureBeyondThirty();
    }

    private void temperatureBeyondThirty() {
        temperature = 30;
    }

    private void addTemperature() {
        temperature ++;
    }

    public void decreaseTemperature() {
        if(isOn) reduceTemperature();
        if(temperature < 16) temperatureBelowSixteen();
    }

    private void temperatureBelowSixteen() {
        temperature = 16;
    }

    private void reduceTemperature() {
        temperature --;
    }
}
