//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.netology.domain;

public class Radio {
    private int minStation;
    private int maxStation = 9;
    private int currentStation;
    private int minVolume;
    private int maxVolume = 100;
    private int currentVolume;

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation >= this.minStation) {
            if (newCurrentStation <= this.maxStation) {
                this.currentStation = newCurrentStation;
            }
        }
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public void nextStation() {
        ++this.currentStation;
        if (this.currentStation == 10) {
            this.currentStation = 0;
        }

        int newCurrentStation = this.currentStation;
        this.setCurrentStation(newCurrentStation);
    }

    public void previousStation() {
        --this.currentStation;
        if (this.currentStation == -1) {
            this.currentStation = 9;
        }

        int newCurrentStation = this.currentStation;
        this.setCurrentStation(newCurrentStation);
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= this.minVolume) {
            if (newCurrentVolume <= this.maxVolume) {
                this.currentVolume = newCurrentVolume;
            }
        }
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void increaseVolume() {
        if (this.currentVolume < 100) {
            ++this.currentVolume;
        }

    }

    public void decreaseVolume() {
        if (this.currentVolume > 0) {
            --this.currentVolume;
        }

    }

    public Radio() {
    }

    public Radio(int minStation, int maxStation, int currentStation, int minVolume, int maxVolume, int currentVolume) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = currentStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
    }

    public int getMinStation() {
        return this.minStation;
    }

    public int getMaxStation() {
        return this.maxStation;
    }

    public int getMinVolume() {
        return this.minVolume;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Radio)) {
            return false;
        } else {
            Radio other = (Radio) o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getMinStation() != other.getMinStation()) {
                return false;
            } else if (this.getMaxStation() != other.getMaxStation()) {
                return false;
            } else if (this.getCurrentStation() != other.getCurrentStation()) {
                return false;
            } else if (this.getMinVolume() != other.getMinVolume()) {
                return false;
            } else if (this.getMaxVolume() != other.getMaxVolume()) {
                return false;
            } else {
                return this.getCurrentVolume() == other.getCurrentVolume();
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Radio;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + this.getMinStation();
        result = result * 59 + this.getMaxStation();
        result = result * 59 + this.getCurrentStation();
        result = result * 59 + this.getMinVolume();
        result = result * 59 + this.getMaxVolume();
        result = result * 59 + this.getCurrentVolume();
        return result;
    }

    public String toString() {
        int var10000 = this.getMinStation();
        return "Radio(minStation=" + var10000 + ", maxStation=" + this.getMaxStation() + ", currentStation=" + this.getCurrentStation() + ", minVolume=" + this.getMinVolume() + ", maxVolume=" + this.getMaxVolume() + ", currentVolume=" + this.getCurrentVolume() + ")";
    }
}
