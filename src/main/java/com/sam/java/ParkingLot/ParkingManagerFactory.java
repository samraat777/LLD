package com.sam.java.ParkingLot;

public class ParkingManagerFactory {


    public ParkingSpotManager getParkingManager(VehicleType vehicleType)
    {
        switch(vehicleType)
        {
            case TWOWHEEL:
                return new TwoWheelerParkingSpotManager();
            case FOURWHEEL:
                return new FourWheelerParkingSpotManager();
            default:
                return null;
        }

    }
}
