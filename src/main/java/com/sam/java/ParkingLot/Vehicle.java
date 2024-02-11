package com.sam.java.ParkingLot;

public class Vehicle {
    int vehicleNo;
    VehicleType type;

    public Vehicle(int vehicleNo, VehicleType type) {
        this.vehicleNo = vehicleNo;
        this.type = type;
    }

    public int getVehicleNo() {
        return vehicleNo;
    }

    public VehicleType getType() {
        return type;
    }

    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
}
