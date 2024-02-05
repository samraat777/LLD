package com.sam.java.StrategyDesignPattern;

public class NormalDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Drive");
    }
}
