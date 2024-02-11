package com.sam.java.ParkingLot;

import java.util.UUID;

public abstract class ParkingSpot {



    ParkingSpot(){

    }
    public static UUID uuid;
    boolean isEmpty;
    Vehicle vehicle;
    int price;



    public boolean isEmpty() {
        return isEmpty;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getPrice() {
        return price;
    }

    public void setUuid( ) {
        this.uuid = UUID.randomUUID();
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void setPrice();
}
