package com.sam.java.StrategyDesignPattern;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SportyDrive());
    }
}
