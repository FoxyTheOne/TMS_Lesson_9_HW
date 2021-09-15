package com.tms.lesson9.prog01Position.position.accountant;

import com.tms.lesson9.prog01Position.position.IPosition;

public class Accountant implements IPosition {

    @Override
    public void printPosition() {
        System.out.println("Должность - бухгалтер");
    }

}
