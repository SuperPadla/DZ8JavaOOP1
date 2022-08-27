package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int amountStation = 10;
    private int minStation;

    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume;

    public int getAmountStation() {
        return amountStation;
    }

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    public Radio() {

    }

    public void setCurrentStation(int currentStation) { // Номер текущей станции от 0 до 9
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > amountStation - 1) {
            return;
        }
        this.currentStation = currentStation;

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNextStation() {   // переключение на следующую станцию
        if (currentStation == amountStation - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void setPrevStation() {  // предыдущая станция
        if (currentStation == 0) {
            currentStation = amountStation - 1;
        } else {
            currentStation--;
        }
    }

    public void setCurrentVolume(int currentVolume) { // пределы громкости от 0 до 100
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {  // получение текущего значения громкости
        return currentVolume;
    }

    public void setIncreaseVolume() {  // достижение максимального уровня громкости
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void setDecreaseVolume() {  // достижение минимального уровня громкости
        if (currentVolume == 0) {
            return;
        }
        currentVolume--;
    }

}
