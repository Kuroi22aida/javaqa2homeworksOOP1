package ru.netology.domain;

public class Radio {
    private int minStation;
    private int maxStation = 9;
    private int currentStation;
    private int minVolume;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio(int maxStation) {
        this.maxStation = 9;
    }

    public Radio() {
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        currentStation = currentStation + 1;
        if (currentStation == 10) {
            currentStation = 0;
        }
        int newCurrentStation = currentStation;
        setCurrentStation(newCurrentStation);
    }

    public void previousStation() {
        currentStation = currentStation - 1;
        if (currentStation == -1) {
            currentStation = 9;
        }
        int newCurrentStation = currentStation;
        setCurrentStation(newCurrentStation);
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}