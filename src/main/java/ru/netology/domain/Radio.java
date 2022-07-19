package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolumе;

    public void setCurrentStation(int currentStation) { // Номер текущей станции от 0 до 9
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;

    }

    public void next() {   // переключение на следующую станцию
        if (currentStation >= 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }

    }

    public void prev() {  // предыдущая станция
        if (currentStation <= 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }

    }

    public void customStation() {  //пользовательская станция
        int newCurrentStation = getCurrentStation();
        setCurrentStation(newCurrentStation);
    }

    public int getCurrentStation() {  // получение текущего значения станции
        return currentStation;
    }

    public void setCurrentVolumе(int currentVolumе) { // пределы громкости от 0 до 10
        if (currentVolumе < 0) {
            return;
        }
        if (currentVolumе > 10) {
            return;
        }
        this.currentVolumе = currentVolumе;
    }

    public int getCurrentVolum() {  // получение текущего значения громкости
        return currentVolumе;
    }

    public void increaseVolume() {  // достижение максимального уровня громкости
        if (currentVolumе >= 10) {
            currentVolumе = 10;
        } else {
            currentVolumе = currentVolumе + 1;
        }
    }

    public void decreaseVolume() {  // достижение минимального уровня громкости
        if (currentVolumе <= 0) {
            currentVolumе = 0;
        } else {
            currentVolumе = currentVolumе - 1;
        }
    }

}
