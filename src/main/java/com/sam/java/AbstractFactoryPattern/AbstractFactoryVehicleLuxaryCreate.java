package com.sam.java.AbstractFactoryPattern;

public class AbstractFactoryVehicleLuxaryCreate extends AbstractFactoryCreateVehicle{
    public Vehicle createLuxaryVehicle(String name) throws Exception {
            if(name== "AUDI")
                return getVehicle(name);
            if(name == "BMW")
                return getVehicle(name);
        throw new Exception("Luxary Vehicle unknown");
    }
}
