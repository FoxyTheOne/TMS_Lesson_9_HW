package com.tms.lesson9;

import com.tms.lesson9.exception.ExistsException;
import com.tms.lesson9.prog00Figure.Figure;
import com.tms.lesson9.prog00Figure.IFigure;
import com.tms.lesson9.prog00Figure.circle.Circle;
import com.tms.lesson9.prog00Figure.rectangle.Rectangle;
import com.tms.lesson9.prog00Figure.triangle.Triangle;

/**
 * 0. Написать иерархию классов «Фигуры»: Фигура -> Треугольник -> Прямоугольник -> Круг.
 * Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
 * -----
 * Создать массив из 5 фигур. Вывести на экран сумму периметра всех фигур в массиве.
 */
public class FigureMain {
    public static void main(String[] args) {
        try {
            //Выбираем фигуру для расчёта (1-3)
            Figure figureCode = new Figure(1);

            //Создаём объект выбранной фигуры (в метод ниже передаём код фигуры, введенный выше)
            IFigure iFigure = getFigureByCode(figureCode.getFigureCode());

            //Проводим расчёты с выбранной фигурой
            iFigure.printFigure(); //Выбранная фигура
            System.out.println();
            boolean exists = iFigure.figureExists(); //Фигура существует?
            double area = iFigure.calculateArea();
            double perimeter = iFigure.calculatePerimeter();

            System.out.printf("Площадь фигуры равна %.2f \n", area);
            System.out.printf("Периметр фигуры равен %.2f \n", perimeter);

            System.out.println("-----");

            System.out.println("Создаю массив из 5 разных фигур.");
            IFigure[] arrayOfFigures = new IFigure[5];
            //Заполняем массив фигурами
            fillArray(arrayOfFigures);

            //Считаем периметр каждой фигуры и суммируем
            double sumPerimeter = 0;
            for (int i = 0; i < arrayOfFigures.length; i++) {
                exists = arrayOfFigures[i].figureExists(); //Фигура существует?
                double per = arrayOfFigures[i].calculatePerimeter();
                sumPerimeter = sumPerimeter + per;
            }
            System.out.printf("Сумма периметров всех фигур в массиве равна %.2f \n", sumPerimeter);
        } catch (ExistsException e1) {
            System.out.println("Перехваченное исключение - " + e1);
        }
    }

    //Переменный код
    //Наш метод для создания объекта выбранной фигуры
    private static IFigure getFigureByCode(int figureCode) throws ExistsException {
        IFigure iFigure = null;

        if (figureCode == 1) {
            iFigure = new Circle(1);
        } else if (figureCode == 2) {
            iFigure = new Rectangle(1, 1);
        } else if (figureCode == 3) {
            iFigure = new Triangle(3, 3, 5);
        } else {
            throw new ExistsException("Такая фигура в программе не предусмотрена");
        }

        return iFigure;
    }

    private static void fillArray (IFigure[]arrayOfFigures) {
        //Создаем объекты, а ссылки на них храним в массиве ссылок класса IFigure
        arrayOfFigures[0] = new Circle(1);
        arrayOfFigures[1] = new Rectangle(1, 5);
        arrayOfFigures[2] = new Triangle(1, 5, 5);
        arrayOfFigures[3] = new Rectangle(10, 2);
        arrayOfFigures[4] = new Circle(10);
    }
}
