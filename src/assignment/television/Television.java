package assignment.television;

public class Television {
    private boolean isOn;
    private int volume;
    private int tempVolume;
    private boolean isMute;
    private int channel;


    public boolean isOn() {
        return isOn;
    }

    public void power() {
        if(!isOn) isOn = true;
        else isOn = false;
    }

    public void increaseVolume() {
        if(isOn)addVolume();
        if(volume > 100)addVolumeBeyondHundred();
    }

    private void addVolumeBeyondHundred() {
            volume = 100;
            tempVolume = 100;
    }

    private void addVolume() {
            volume ++;
            tempVolume++;
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume() {
        if(isOn)reduceVolume();
        if(volume < 0)reduceVolumeBelowZero();
    }

    private void reduceVolumeBelowZero() {
            volume = 0;
            tempVolume = 0;
    }

    private void reduceVolume() {
            volume--;
            tempVolume --;
    }

    public void muteControl() {
        if(isOn){
            if(!isMute)isMuteIsFalse();
            else isMuteIsTrue();
        }
    }

    private void isMuteIsTrue() {
            isMute = false;
            volume = tempVolume;
    }

    private void isMuteIsFalse() {
            isMute = true;
            volume = 0;
    }

    public boolean isMute() {
        return isMute;
    }


    public void nextChannel() {
        if(isOn)channel++;
    }

    public int getChannel() {
        return channel;
    }

    public void previousChannel() {
        if(isOn) channel--;
        if(channel < 0)channel = 0;
    }

    public void setChannel(int channel) {
        if(isOn){
            if(channel >= 0){
                this.channel = channel;
            }
        }
    }
}
