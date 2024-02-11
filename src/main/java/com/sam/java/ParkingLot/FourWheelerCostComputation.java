package com.sam.java.ParkingLot;

public class FourWheelerCostComputation extends CostComputation{
    public FourWheelerCostComputation(Vehicle vehicle) {
        super(vehicle,new MinutePricingStrategy(120));
    }
}
