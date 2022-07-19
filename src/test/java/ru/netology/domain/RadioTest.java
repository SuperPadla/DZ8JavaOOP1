package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {   // Номер текущей радиостанции от 0 до 9
        @Test
        public void currentStationNumber() {
            Radio radio = new Radio();
            radio.setCurrentStation(8);

            int actual = radio.getCurrentStation();
            int expected = 8;

            Assertions.assertEquals(actual, expected);
        }

        @Test
        public void currentStationNumber2() {
            Radio radio = new Radio();
            radio.setCurrentStation(11);

            int actual = radio.getCurrentStation();
            int expected = 0;

            Assertions.assertEquals(actual, expected);
        }

        @Test
        public void currentStationNumber3() {
            Radio radio = new Radio();
            radio.setCurrentStation(-1);

            int actual = radio.getCurrentStation();
            int expected = 0;

            Assertions.assertEquals(actual, expected);
        }

        @Test
        public void nextStation() {
            Radio radio = new Radio();
            radio.setCurrentStation(4);
            radio.next();

            int actual = radio.getCurrentStation();
            int expected = 5;

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void nextStation2() {
            Radio radio = new Radio();
            radio.setCurrentStation(9);
            radio.next();

            int actual = radio.getCurrentStation();
            int expected = 0;

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void prevStation() {
            Radio radio = new Radio();

            radio.setCurrentStation(3);
            radio.prev();

            int actual = radio.getCurrentStation();
            int expected = 2;

            Assertions.assertEquals(actual, expected);
        }

        @Test
        public void prevStation2() {
            Radio radio = new Radio();

            radio.setCurrentStation(2);
            radio.prev();

            int actual = radio.getCurrentStation();
            int expected = 1;

            Assertions.assertEquals(actual, expected);
        }

        @Test
        public void prevStation3() {
            Radio radio = new Radio();

            radio.setCurrentStation(0);
            radio.prev();

            int actual = radio.getCurrentStation();
            int expected = 9;

            Assertions.assertEquals(actual, expected);
        }

        @Test
        public void customRadioStation() {
            Radio radio = new Radio();

            radio.setCurrentStation(7);
            radio.customStation();

            int actual = radio.getCurrentStation();
            int expected = 7;
            Assertions.assertEquals(actual, expected);
        }

        @Test
        public void currentVolume() {
            Radio radio = new Radio();
            radio.setCurrentVolumе(7);

            int actual = radio.getCurrentVolum();
            int expected = 7;

            Assertions.assertEquals(actual, expected);
        }

        @Test
        public void currentVolume2() {
            Radio radio = new Radio();
            radio.setCurrentVolumе(-1);

            int actual = radio.getCurrentVolum();
            int expected = 0;

            Assertions.assertEquals(actual, expected);
        }

        @Test
        public void turnUpTheVolume() {
            Radio radio = new Radio();

            radio.setCurrentVolumе(6);
            radio.increaseVolume();

            int actual = radio.getCurrentVolum();
            int expected = 7;

            Assertions.assertEquals(actual, expected);
        }

        @Test
        public void turnUpTheVolume2() {
            Radio radio = new Radio();

            radio.setCurrentVolumе(10);
            radio.increaseVolume();

            int actual = radio.getCurrentVolum();
            int expected = 10;

            Assertions.assertEquals(actual, expected);
        }

        @Test
        public void turnUpTheVolume3() {
            Radio radio = new Radio();

            radio.setCurrentVolumе(11);

            int actual = radio.getCurrentVolum();
            int expected = 0;

            Assertions.assertEquals(actual, expected);
        }

        @Test
        public void turnDownTheVolume() {
            Radio radio = new Radio();

            radio.setCurrentVolumе(5);
            radio.decreaseVolume();

            int actual = radio.getCurrentVolum();
            int expected = 4;

            Assertions.assertEquals(actual, expected);
        }

        @Test
        public void turnDownTheVolume2() {
            Radio radio = new Radio();

            radio.setCurrentVolumе(0);
            radio.decreaseVolume();

            int actual = radio.getCurrentVolum();
            int expected = 0;

            Assertions.assertEquals(actual, expected);
        }

        @Test
        public void turnDownTheVolume3() {
            Radio radio = new Radio();

            radio.setCurrentVolumе(-1);
            radio.decreaseVolume();

            int actual = radio.getCurrentVolum();
            int expected = 0;

            Assertions.assertEquals(actual, expected);
        }
}