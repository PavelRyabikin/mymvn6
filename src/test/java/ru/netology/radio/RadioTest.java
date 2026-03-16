package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(14);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetStationBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-5);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);
        radio.next();

        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldNextStationAfter9() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.prev();

        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldPrevStationFrom0() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.increaseVolume();

        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.decreaseVolume();

        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    void shouldNotDecreaseVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldNotSetVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldCreateRadioWithCustomStationsCount() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(29);

        assertEquals(29, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchToFirstStationAfterLast() {
        Radio radio = new Radio(5);

        radio.setCurrentStation(4);
        radio.next();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchToLastStationFromZero() {
        Radio radio = new Radio(5);

        radio.setCurrentStation(0);
        radio.prev();

        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetStationAboveMaxCustomStations() {
        Radio radio = new Radio(5);

        radio.setCurrentStation(7);

        assertEquals(0, radio.getCurrentStation());
    }
}