package com.sam.java.ParkingLot;

import java.util.Date;

public class Ticket {
    Date dateTime ;
    Vehicle vehicle;
    ParkingSpot parkingSpot;

    public Ticket( Vehicle vehicle, ParkingSpot parkingSpot) {
        this.dateTime = new Date();
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

}
