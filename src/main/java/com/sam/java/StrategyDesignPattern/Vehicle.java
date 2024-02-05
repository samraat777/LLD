package com.sam.java.StrategyDesignPattern;

public class Vehicle {
    DriveStrategy driveStrategy;

    //Constructor injection
    Vehicle(DriveStrategy driveStrategy)
    {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
