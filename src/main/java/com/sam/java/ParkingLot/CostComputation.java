package com.sam.java.ParkingLot;

public class CostComputation {
    PricingStrategy pricingStrategy ;
    Vehicle vehicle;
    Ticket ticket;

    public CostComputation(Vehicle vehicle,PricingStrategy pricingStrategy) {
       this.vehicle = vehicle;
       this.pricingStrategy = pricingStrategy;
    }

    public int calculateCost(){
        //return cost
        return pricingStrategy.price();
        //return 0;
    }
}
