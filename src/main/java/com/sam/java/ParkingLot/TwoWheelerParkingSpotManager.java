package com.sam.java.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{



    public TwoWheelerParkingSpotManager() {
        super(new ArrayList<ParkingSpot>(20),new ParkingStrategy1() );
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

    }

    @Override
    public void parkVehicle() {

    }

    @Override
    public void removeVehicle() {

    }
}
