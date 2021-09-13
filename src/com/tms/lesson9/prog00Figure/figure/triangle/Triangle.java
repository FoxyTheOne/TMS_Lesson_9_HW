package com.tms.lesson9.prog00Figure.figure.triangle;

import com.tms.lesson9.exception.ExistsException;
import com.tms.lesson9.prog00Figure.figure.Figure;
import com.tms.lesson9.prog00Figure.figure.IFigure;

public class Triangle extends Figure implements IFigure {
    //Приватные поля
    private int sideC;

    //Конструктор
    public Triangle(int sideA, int sideB, int sideC) {
        super(sideA, sideB);
        this.sideC = sideC;
    }

    //Публичные методы
    @Override
    public double calculateArea() {
        double semiPerimeter = (double) (calculatePerimeter()) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - super.getSideA()) * (semiPerimeter - super.getSideB()) * (semiPerimeter - sideC));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = super.getSideA() + super.getSideB() + sideC;
        return perimeter;
    }

    @Override
    public void printFigure() {
        System.out.println("Выбранная фигура - треугольник");
    }

    @Override
    public boolean figureExists() throws ExistsException {
        if (super.getSideA() + super.getSideB() > sideC
                && super.getSideA() + sideC > super.getSideB()
                && super.getSideB() + sideC > super.getSideA()
                && super.getSideA() > 0
                && super.getSideB() > 0
                && sideC > 0) {
            return true;
        } else {
            throw new ExistsException("Треугольник не существует!");
        }
    }

    //Getter and setter
    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC)  {
        this.sideC = sideC;
    }
}
