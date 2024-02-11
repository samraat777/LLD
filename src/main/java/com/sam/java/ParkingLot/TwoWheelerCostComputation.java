package com.sam.java.ParkingLot;

public class TwoWheelerCostComputation extends CostComputation{
    public TwoWheelerCostComputation(Vehicle vehicle) {
        //Two wheeler computations
        super(vehicle,new HourlyPricingStrategy(8));
    }


}
