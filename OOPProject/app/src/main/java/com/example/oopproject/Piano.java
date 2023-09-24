package com.example.oopproject;

public class Piano implements Instrument,HouseDecor {
    String brand;
    boolean digital;

    @Override
    public void i() {
        System.out.println("Override method");
    }
}
