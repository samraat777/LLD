package com.sam.java.ParkingLot;

public class ExitGate {
    Ticket ticket;
    CostComputationFactory costComputeFactory;
    CostComputation costComputation;


    public ExitGate(Ticket ticket, CostComputationFactory costComputeFactory, CostComputation costComputation, ParkingManagerFactory parkingManagerFactory, ParkingSpotManager parkingSpotManager) {
        this.ticket = ticket;
        this.costComputeFactory = costComputeFactory;
        this.costComputation = costComputation;
        this.parkingManagerFactory = parkingManagerFactory;
        this.parkingSpotManager = parkingSpotManager;
    }

    ParkingManagerFactory parkingManagerFactory;


    ParkingSpotManager parkingSpotManager;

    public int calculatePrice(){
        costComputeFactory = new CostComputationFactory(ticket.getVehicle(),ticket);
        costComputation = costComputeFactory.getPricingStrategy();
        return costComputation.calculateCost();
    }
    public boolean paymentStatus(){
        return true;
    }

    public boolean removeVehicle(){
        //Payment
        System.out.println(ticket.vehicle.vehicleNo + " " + ticket.vehicle.getType());
        parkingSpotManager.removeVehicle();
        return true;
    }
}
