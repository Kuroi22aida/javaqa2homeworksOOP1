//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int minStation;
    private int maxStation = 9;
    private int numberOfStations = 10;
    private int currentStation;
    private int minVolume;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
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
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        int newCurrentStation = currentStation;
        setCurrentStation(newCurrentStation);
    }

    public void previousStation() {
        currentStation = currentStation - 1;
        if (currentStation < minStation) {
            currentStation = maxStation;
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
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}