package Assignment;

public class AirConditioner {
   private boolean isOn;
   private boolean isOff;

   private int temperature = 16;


    public boolean setOn() {
        int power = 1;
        if(power == 1){
            isOn = true;
            System.out.println("Ac is on");
        }
        if(power == 0) {
            isOn = false;
            System.out.print("Ac is off");
        }
        return isOn;
    }
    public boolean setOff() {
        int power = 0;
        if(power == 0){
            isOff = true;
            System.out.println("Ac is off");
        }
        if(power == 1){
            isOff = false;
        }
        return isOff;
    }





    public void increaseTemperature(){
        int num = 1;
        if(isOn == true){
            for (int tempIncr = 0; tempIncr < 10; tempIncr++){
                temperature += num;
                if(temperature > 30){
                    temperature = 30;
                    System.out.println("Temperature cant exceed 30");
                }
            }
            System.out.println("Temperature at"+" "+ temperature);
        }

        else {
            System.out.println("Put on Ac");
        }
    }

    public void decreaseTemperature() {
        int num = 1;
        if(isOn == true){
            for (int tempDecr = 0; tempDecr < 10 ; tempDecr++){
                temperature -= num;
                System.out.println("Temperature at"+" "+ temperature);
                if(temperature < 16){
                    temperature = 16;
                    System.out.println("Minimum Temperature is 16");
                }
            }
        }

    }



    public int getTemperature() {
        return temperature;
    }
}

