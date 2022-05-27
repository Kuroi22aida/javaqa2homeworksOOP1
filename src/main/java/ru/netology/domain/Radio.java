package ru.netology.domain;

public class Radio {
    private int currentStation;

    public void nextStation() {
        if (currentStation < 10) {
            currentStation = currentStation + 1;
        }
        if (currentStation == 10) {
            currentStation = 0;
        }
        int newCurrentStation = currentStation;
        setCurrentStation(newCurrentStation);
    }

    public void previousStation() {
        if (currentStation > -1) {
            currentStation = currentStation - 1;
        }
        if (currentStation == -1) {
            currentStation = 9;
        }
        int newCurrentStation = currentStation;
        setCurrentStation(newCurrentStation);
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    private int currentVolume;

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
