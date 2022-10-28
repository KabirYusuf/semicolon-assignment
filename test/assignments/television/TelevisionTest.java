package assignments.television;

import assignment.television.Television;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {
    Television television;

    @BeforeEach
    void setUp(){
        television = new Television();
    }

    @Test
    public void televisionCanBeTurnedOnTest(){
        assertFalse(television.isOn());
        television.power();
        assertTrue(television.isOn());
    }

    @Test
    public void televisionCanBeTurnedOffTest(){
        assertFalse(television.isOn());
        television.power();
        assertTrue(television.isOn());
        television.power();
        assertFalse(television.isOn());
    }

    @Test
    public void televisionVolumeCanBeIncreasedTest(){
        television.power();
        television.increaseVolume();
        assertEquals(1, television.getVolume());
        television.increaseVolume();
        television.increaseVolume();
        assertEquals(3,television.getVolume());
    }
    @Test
    public void televisionVolumeCantIncreaseWhenTelevisionIsOff(){
        assertFalse(television.isOn());
        television.increaseVolume();
        assertEquals(0,television.getVolume());
    }

    @Test
    public void televisionVolumeCantIncreaseBeyondHundred(){
        television.power();
        for (int i = 0; i < 100; i++) {
            television.increaseVolume();
        }
        assertEquals(100, television.getVolume());
        television.increaseVolume();
        assertEquals(100, television.getVolume());
    }
    @Test
    public void TelevisionVolumeCanDecrementTest(){
        television.power();
        for (int i = 0; i < 5; i++) {
            television.increaseVolume();
        }
        assertEquals(5, television.getVolume());
        television.decreaseVolume();
        assertEquals(4, television.getVolume());
    }
    @Test
    public void televisionVolumeCantDecreaseWhenTelevisionIsTurnedOff(){
        television.power();
        for (int i = 0; i < 5; i++) {
            television.increaseVolume();
        }
        assertEquals(5,television.getVolume());
        television.power();
        assertFalse(television.isOn());
        television.decreaseVolume();
        assertEquals(5,television.getVolume());
    }
    @Test
    public void televisionVolumeCantGoBelowZeroTest(){
        television.power();
        television.increaseVolume();
        television.increaseVolume();
        assertEquals(2, television.getVolume());
        television.decreaseVolume();
        television.decreaseVolume();
        television.decreaseVolume();
        assertEquals(0, television.getVolume());
    }

    @Test
    public void testThatTelevisionCanBeMuted(){
        television.power();
        television.muteControl();
        assertTrue(television.isMute());
    }

    @Test
    public void testThatTelevisionVolumeIsZeroWhenMutedEvenWhenVolumeIsGreaterThanZero(){
        television.power();
        television.increaseVolume();
        television.increaseVolume();
        assertEquals(2, television.getVolume());
        television.muteControl();
        assertTrue(television.isMute());
        assertEquals(0,television.getVolume());
    }

    @Test
    public void testThatTelevisionCanOnlyBeMutedWhenTelevisionIsOn(){
        television.muteControl();
        assertFalse(television.isMute());
    }

    @Test
    public void testThatTelevisionCanBeUnMuted(){
        television.power();
        television.muteControl();
        assertTrue(television.isMute());
        television.muteControl();
        assertFalse(television.isMute());
    }

    @Test
    public void televisionVolumeIsTheSameWhenUnMutedAfterTelevisionWasMuted(){
        television.power();
        for (int i = 0; i < 15; i++) {
            television.increaseVolume();
        }
        assertEquals(15, television.getVolume());
        television.muteControl();
        assertTrue(television.isMute());
        assertEquals(0,television.getVolume());
        television.muteControl();
        assertEquals(15, television.getVolume());

    }

    @Test
    public void testThatTelevisionCanOnlyBeUnMutedWhenTelevisionIsTurnedON(){
        television.power();
        television.muteControl();
        assertTrue(television.isMute());
        television.power();
        television.muteControl();
        assertTrue(television.isMute());

    }

    @Test
    public void testThatTelevisionChannelCanChangeToNextChannel(){
        television.power();
        television.nextChannel();
        assertEquals(1, television.getChannel());
    }

    @Test
    public void testThatChannelCannotBeChangedWhenTelevisionIsOff(){
        assertFalse(television.isOn());
        television.nextChannel();
        assertEquals(0,television.getChannel());
    }
    @Test
    public void testThatTelevisionChannelCanChangeToPreviousChannel(){
        television.power();
        for (int i = 0; i < 5; i++) {
            television.nextChannel();
        }
        assertEquals(5, television.getChannel());
        television.previousChannel();
        assertEquals(4,television.getChannel());

    }
    @Test
    public void testThatTelevisionChannelCantBeNegative(){
        television.power();
        for (int i = 0; i < 3; i++) {
            television.nextChannel();
        }
        assertEquals(3, television.getChannel());
        for (int i = 0; i < 4; i++) {
            television.previousChannel();
        }
        assertEquals(0, television.getChannel());
    }
    @Test
    public void testThatTelevisionChannelCantGiveAPreviousChannelWhenTurnedOff(){
        television.power();
        television.nextChannel();
        television.nextChannel();
        assertEquals(2, television.getChannel());
        television.power();
        assertFalse(television.isOn());
        television.previousChannel();
        assertEquals(2, television.getChannel());
    }

    @Test
    public void testThatChannelCanBeSet(){
        television.power();
        television.setChannel(23);
        assertEquals(23,television.getChannel());
    }
    @Test
    public void testThatChannelCanBeNegative(){
        television.power();
        television.setChannel(-40);
        assertEquals(0, television.getChannel());
    }
    @Test
    public void testThatChannelCanBeSetOnlyWhenTurnedOn(){
        television.setChannel(87);
        assertEquals(0,television.getChannel());
    }

}