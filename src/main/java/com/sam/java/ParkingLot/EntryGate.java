package com.sam.java.ParkingLot;



public class EntryGate {

    Vehicle vehicle;
    ParkingManagerFactory parkingManagerFactory;
    ParkingSpotManager parkingSpotManager;
    Ticket ticket;
    ParkingSpot parkingSpot;



    public ParkingSpot findSpot(VehicleType vehicleType){
       parkingSpot = parkingSpotManager.findParkingSpot();
       return parkingSpot;
    }

    public void bookSpot(){
        //Making spot in array true
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot){
        ticket = new Ticket(vehicle,parkingSpot);
        return ticket;
    }

    public EntryGate(Vehicle vehicle, ParkingManagerFactory parkingManagerFactory, ParkingSpotManager parkingSpotManager, Ticket ticket, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.parkingManagerFactory = parkingManagerFactory;
        this.parkingSpotManager = parkingSpotManager;
        this.ticket = ticket;
        this.parkingSpot = parkingSpot;
    }
}
