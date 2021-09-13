package com.tms.lesson9.prog01Position.position.worker;

import com.tms.lesson9.prog01Position.position.IPosition;

public class Worker implements IPosition {

    @Override
    public void printPosition() {
        System.out.println("Должность - рабочий");
    }

}
