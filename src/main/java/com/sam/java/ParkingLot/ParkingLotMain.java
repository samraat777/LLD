package com.sam.java.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotMain {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(123,VehicleType.TWOWHEEL);
        ParkingManagerFactory parkingManagerFactory = new ParkingManagerFactory();
        ParkingSpot parkingSpot = new TwoWheelerParkingSpot();
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        parkingSpots.add(parkingSpot);
        ParkingSpotManager parkingSpotManager = parkingManagerFactory.getParkingManager(vehicle.type);
        Ticket ticket = new Ticket(vehicle,parkingSpot);
        CostComputationFactory costComputationFactory = new CostComputationFactory(vehicle,ticket);
        CostComputation costComputation = costComputationFactory.getPricingStrategy();
        costComputation.calculateCost();



        EntryGate entryGate = new EntryGate(vehicle,parkingManagerFactory,parkingSpotManager,ticket,parkingSpot);

        entryGate.bookSpot();

        ExitGate exitGate = new ExitGate(ticket,costComputationFactory,costComputation,parkingManagerFactory,parkingSpotManager);
        exitGate.calculatePrice();
    }
}
