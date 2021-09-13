package com.tms.lesson9;

import com.tms.lesson9.exception.ExistsException;
import com.tms.lesson9.prog01Position.position.IPosition;
import com.tms.lesson9.prog01Position.position.accountant.Accountant;
import com.tms.lesson9.prog01Position.position.director.Director;
import com.tms.lesson9.prog01Position.position.worker.Worker;
import com.tms.lesson9.prog01Position.positionCode.PositionCode;

/**
 * 1. Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом, который печатает название должности и имплементировать этот метод в созданные классы.
 */
public class PositionMain {
    public static void main(String[] args) {
        try {
            //Выбираем должность по коду (1-3)
            PositionCode positionCode = new PositionCode(1);

            //Создаём соответствующий объект - должность (в метод ниже передаём код, введенный выше)
            IPosition iPosition = getPositionByCode(positionCode.getPositionCode());

            //Печатаем название выбранной должности
            iPosition.printPosition();
        } catch (ExistsException e2) {
            System.out.println("Перехваченное исключение - " + e2);
        }
    }

    //Переменный код
    private static IPosition getPositionByCode(int positionCode) throws ExistsException {
        IPosition iPosition = null;

        if (positionCode == 1) {
            iPosition = new Accountant();
        } else if (positionCode == 2) {
            iPosition = new Director();
        } else if (positionCode == 3) {
            iPosition = new Worker();
        } else {
            throw new ExistsException("Такая должность в программе не предусмотрена");
        }

        return iPosition;
    }
}
