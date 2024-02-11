package com.sam.java.ParkingLot;

public class MinutePricingStrategy extends PricingStrategy{
    public MinutePricingStrategy(int timeUnit) {
        super(timeUnit);
    }

    @Override
    public int price() {
        System.out.println(1*timeUnit);
        return 1*timeUnit;
    }
}
