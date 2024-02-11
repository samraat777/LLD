package com.sam.java.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{

    public FourWheelerParkingSpotManager() {
        super(new ArrayList<ParkingSpot>(20), new ParkingStrategy2());
    }

    @Override
    public ParkingSpot findParkingSpot() {
        return null;
    }

    @Override
    public ParkingSpot addParkingSpot() {
        return null;
    }

    @Override
    public Ticket bookParkingSpot() {
        return null;
    }

    @Override
    public void removeParkingSpot() {
        System.out.println("Vehicle Exit from Parking");
    }

    @Override
    public void parkVehicle() {

    }

    @Override
    public void removeVehicle() {

    }
}
