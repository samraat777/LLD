package com.sam.java.StrategyDesignPattern;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new SportyDrive());
    }
}
