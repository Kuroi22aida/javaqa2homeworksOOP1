package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio rad = new Radio();

    @Test
    void shouldChangeStation() {
        rad.setCurrentStation(7);

        int actual = rad.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStation1() {
        rad.setCurrentStation(9);

        int actual = rad.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStation2() {

        rad.setCurrentStation(15);

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStation3() {

        rad.setCurrentStation(-2);

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextStation() {

        rad.setCurrentStation(9);

        rad.nextStation();

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextStation1() {

        rad.setCurrentStation(8);

        rad.nextStation();

        int actual = rad.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void previousStation() {

        rad.setCurrentStation(0);

        rad.previousStation();

        int actual = rad.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void previousStation1() {

        rad.setCurrentStation(1);

        rad.previousStation();

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }


    @Test
    void shouldIncreaseVolume() {

        rad.setCurrentVolume(5);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume1() {

        rad.setCurrentVolume(100);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {

        rad.setCurrentVolume(0);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume1() {

        rad.setCurrentVolume(5);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeVolume() {

        rad.setCurrentVolume(120);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeVolume1() {

        rad.setCurrentVolume(-10);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

}
