package com.tms.lesson9.prog00Figure.figure;

import com.tms.lesson9.exception.ExistsException;

public interface IFigure {

    public double calculateArea();

    public double calculatePerimeter();

    public void printFigure();

    public boolean figureExists() throws ExistsException;

}
