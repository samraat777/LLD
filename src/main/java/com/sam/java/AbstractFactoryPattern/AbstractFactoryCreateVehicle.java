package com.sam.java.AbstractFactoryPattern;

public class AbstractFactoryCreateVehicle {
    public Vehicle getVehicle(String input) throws Exception {
        switch(input)
        {
            case "AUDI":
                return new Audi();
            case "BMW":
                return new BMW();
            case "KIA":
                    return new Kia();
            case "HONDA":
                return new Honda();
        }
        throw new Exception("Vehicle Unknown");
    }
}
