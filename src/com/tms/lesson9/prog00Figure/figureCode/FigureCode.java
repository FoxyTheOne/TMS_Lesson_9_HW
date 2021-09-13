package com.tms.lesson9.prog00Figure.figureCode;

public class FigureCode {

    private int figureCode;

    //Конструктор, в который передаем код нашей фигуры
    public FigureCode(int figureCode) {
        this.figureCode = figureCode;
    }

    //Getter and setter
    public int getFigureCode() {
        return figureCode;
    }

    public void setFigureCode(int figureCode) {
        this.figureCode = figureCode;
    }

}
