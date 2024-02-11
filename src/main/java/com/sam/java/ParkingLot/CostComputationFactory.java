package com.sam.java.ParkingLot;

public class CostComputationFactory {
    Vehicle vehicle;
    Ticket ticket;
    public CostComputationFactory(Vehicle vehicle,Ticket ticket) {
        this.vehicle = vehicle;
        this.ticket  = ticket;
    }



    public CostComputation getPricingStrategy()
    {
        switch (ticket.getVehicle().getType())
        {
            case TWOWHEEL:
                return new TwoWheelerCostComputation(vehicle);
            case FOURWHEEL:
                return new FourWheelerCostComputation(vehicle);
        }
        return null;
    }
}
