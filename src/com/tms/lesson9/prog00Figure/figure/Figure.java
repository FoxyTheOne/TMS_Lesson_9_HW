package com.tms.lesson9.prog00Figure.figure;

public abstract class Figure {
    //Приватные поля
    private int sideA;
    private int sideB;

    //Конструктор
    public Figure(int sideA, int sideB) {
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
}
