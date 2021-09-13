package com.tms.lesson9.prog01Position.position.director;

import com.tms.lesson9.prog01Position.position.IPosition;

public class Director implements IPosition {

    @Override
    public void printPosition() {
        System.out.println("Должность - директор");
    }

}
