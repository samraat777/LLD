package com.sam.java.AbstractFactoryPattern;

public class VehicleMain {
    public static void main(String[] args) throws Exception {
        //Creating Based on abstractFactoryVehicle
        AbstractFactoryCreateVehicle abstractFactoryCreateVehicle = new AbstractFactoryCreateVehicle();

        Vehicle vehicle1 = abstractFactoryCreateVehicle.getVehicle("AUDI");
        vehicle1.average();

        Vehicle vehicle2 = abstractFactoryCreateVehicle.getVehicle("HONDA");
        vehicle2.average();


        //This Factory will internally use AbstractFactoryCreateVehicle to create concreate classes
        AbstractFactoryVehicleLuxaryCreate abstractFactoryVehicleLuxaryCreate = new AbstractFactoryVehicleLuxaryCreate();
        Vehicle vehicle3 = abstractFactoryVehicleLuxaryCreate.createLuxaryVehicle("BMW");
        vehicle3.average();
        //Below will give exception as we will be getting no class
        Vehicle vehicle4 = abstractFactoryVehicleLuxaryCreate.createLuxaryVehicle("KIA");
        vehicle4.average();

    }
}
