package com.tms.lesson9.prog00Figure.figure.circle;

import com.tms.lesson9.exception.ExistsException;
import com.tms.lesson9.prog00Figure.figure.IFigure;

public class Circle implements IFigure {
    //Публичные поля
    public final double NUMBER_PI = 3.14159265359;

    //Приватные поля
    private int radius;

    //Конструктор
    public Circle(int radius) {
        this.radius = radius;
    }

    //Публичные методы
    @Override
    public double calculateArea() {
        double area = NUMBER_PI * radius * radius;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * NUMBER_PI * radius;
        return perimeter;
    }

    @Override
    public void printFigure() {
        System.out.println("Выбранная фигура - круг");
    }

    @Override
    public boolean figureExists() throws ExistsException {
        if (radius > 0) {
            return true;
        } else {
            throw new ExistsException("Круг не существует!");
        }
    }

    //Getter and setter
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
