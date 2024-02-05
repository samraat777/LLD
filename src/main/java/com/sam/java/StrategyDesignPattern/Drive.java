package com.sam.java.StrategyDesignPattern;

public class Drive {
    public static void main(String[] args) {
        Vehicle vehicle1 = new SportsVehicle();
        vehicle1.drive();
        Vehicle vehicle2 = new GoodsVehicle();
        vehicle2.drive();
        Vehicle vehicle3 = new OffRoadVehicle();
        vehicle3.drive();
    }
}
