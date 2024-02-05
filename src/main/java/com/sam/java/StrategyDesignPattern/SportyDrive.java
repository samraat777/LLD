package com.sam.java.StrategyDesignPattern;

public class SportyDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sporty Drive");
    }
}
