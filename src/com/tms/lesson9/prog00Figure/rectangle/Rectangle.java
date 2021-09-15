package com.tms.lesson9.prog00Figure.rectangle;

import com.tms.lesson9.exception.ExistsException;
import com.tms.lesson9.prog00Figure.Figure;
import com.tms.lesson9.prog00Figure.IFigure;

public class Rectangle extends Figure implements IFigure {
    //Конструктор
    public Rectangle(int sideA, int sideB) {
        super(sideA, sideB);
    }

    //Публичные методы
    @Override
    public double calculateArea() {
        double area = super.getSideA() * super.getSideB();
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = (super.getSideA() + super.getSideB()) * 2;
        return perimeter;
    }

    @Override
    public void printFigure() {
        System.out.println("Выбранная фигура - прямоугольник");
    }

    @Override
    public boolean figureExists() throws ExistsException {
        if (super.getSideA() > 0 && super.getSideB() > 0) {
            return true;
        } else {
            throw new ExistsException("Прямоугольник не существует!");
        }
    }
}
