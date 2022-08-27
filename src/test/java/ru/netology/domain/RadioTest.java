package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {   // Номер текущей радиостанции от 0 до 9
    Radio radio = new Radio();

    @Test
    void currentStationNumber() {
        radio.setCurrentStation(8);
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void currentStationNumber2() {
        radio.setCurrentStation(0);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void currentStationNumber3() {
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void currentStationNumber5() {
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test
    void nextStation() {
        radio.setCurrentStation(4);
        radio.setNextStation();
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void nextStation2() {
        radio.setCurrentStation(9);
        radio.setNextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void prevStation() {
        radio.setCurrentStation(3);
        radio.setPrevStation();
        Assertions.assertEquals(2, radio.getCurrentStation());
    }

    @Test
    void prevStation2() {
        radio.setCurrentStation(9);
        radio.setPrevStation();
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void prevStation3() {
        radio.setCurrentStation(0);
        radio.setPrevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void findCurrentVolume() {  //  проверка границ диапазона громкости (от 0 до 100)
        radio.setCurrentVolume(70);
        Assertions.assertEquals(70, radio.getCurrentVolume());
    }

    @Test
    void findCurrentVolume2() {
        radio.setCurrentVolume(5);
        Assertions.assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void findCurrentVolume3() {
        radio.setCurrentVolume(0);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void findCurrentVolume4() {
        radio.setCurrentVolume(100);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void findCurrentVolume5() {
        radio.setCurrentVolume(101);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void findCurrentVolume6() {
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void upTheVolume() {  //  увеличение уровня громкости
        radio.setCurrentVolume(60);
        radio.setIncreaseVolume();
        Assertions.assertEquals(61, radio.getCurrentVolume());
    }

    @Test
    void upTheVolume2() {
        radio.setCurrentVolume(99);
        radio.setIncreaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void upTheVolume3() {
       radio.setCurrentVolume(100);
        radio.setIncreaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void downTheVolume() {  //  уменьшение уровня громкости
        radio.setCurrentVolume(1);
        radio.setDecreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void downTheVolume2() {
        radio.setCurrentVolume(100);
        radio.setDecreaseVolume();
        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    void downTheVolume3() {
        radio.setCurrentVolume(0);
        radio.setDecreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}