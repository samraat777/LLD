package com.sam.java.ParkingLot;

public class HourlyPricingStrategy extends PricingStrategy{
    public HourlyPricingStrategy(int timeUnit) {
        super(timeUnit);
    }

    @Override
    public int price() {
        System.out.println(timeUnit*20);
        return timeUnit*20;
    }


}
