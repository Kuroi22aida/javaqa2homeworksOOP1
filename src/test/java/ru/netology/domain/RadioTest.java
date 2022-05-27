package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    void shouldChangeStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(7);

        int actual = rad.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStation1() {
        Radio rad = new Radio();
        rad.setCurrentStation(-2);

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(15);

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.nextStation();

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextStation1() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);

        rad.nextStation();

        int actual = rad.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void previousStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.previousStation();

        int actual = rad.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void previousStation1() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);

        rad.previousStation();

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(20);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-10);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }
}
