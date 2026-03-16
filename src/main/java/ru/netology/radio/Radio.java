package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int stationsCount = 10;

    public Radio() {
    }

    public Radio(int stationsCount) {
        this.stationsCount = stationsCount;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < 0) {
            return;
        }

        if (newStation >= stationsCount) {
            return;
        }

        currentStation = newStation;
    }

    public void next() {
        if (currentStation == stationsCount - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = stationsCount - 1;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }

        if (newVolume > 100) {
            return;
        }

        currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}