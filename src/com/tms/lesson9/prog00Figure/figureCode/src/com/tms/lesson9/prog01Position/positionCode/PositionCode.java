package com.tms.lesson9.prog01Position.positionCode;

public class PositionCode {
    private int positionCode;

    //Конструктор, в который передаём код должности для вывода
    public PositionCode(int positionCode) {
        this.positionCode = positionCode;
    }

    //Getter and setter
    public int getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(int positionCode) {
        this.positionCode = positionCode;
    }
}
