package com.tms.lesson9.prog00Figure;

public class Figure {
    //Приватные поля
    private int figureCode;
    private int sideA;
    private int sideB;

    //Конструкторы
    public Figure(int figureCode) {
        this.figureCode = figureCode;
    }

    protected Figure(int sideA, int sideB) { //Для наследников
        this.sideA = sideA;
        this.sideB = sideB;
    }

    //Getter and setter
    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getFigureCode() {
        return figureCode;
    }

    public void setFigureCode(int figureCode) {
        this.figureCode = figureCode;
    }
}
