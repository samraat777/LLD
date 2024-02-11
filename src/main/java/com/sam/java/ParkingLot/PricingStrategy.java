package com.sam.java.ParkingLot;

public abstract class PricingStrategy {

    int timeUnit;

    public PricingStrategy(int timeUnit) {
        this.timeUnit = timeUnit;
    }

   public abstract int price();
}
