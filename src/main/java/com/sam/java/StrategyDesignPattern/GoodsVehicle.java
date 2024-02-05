package com.sam.java.StrategyDesignPattern;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle() {
        super(new NormalDrive());
    }
}
