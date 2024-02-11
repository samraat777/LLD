package com.sam.java.ParkingLot;

import java.util.List;

public abstract class ParkingSpotManager {
    List<ParkingSpot> parkingSpots;
    ParkingStrategy parkingStrategy;
    public ParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy parkingStrategy) {
        this.parkingSpots = parkingSpots;
        this.parkingStrategy = parkingStrategy;
    }


    public abstract ParkingSpot findParkingSpot();
    public abstract ParkingSpot addParkingSpot();
    public abstract Ticket bookParkingSpot();
    public abstract void removeParkingSpot();
    public abstract void parkVehicle();
    public abstract void removeVehicle();




}
