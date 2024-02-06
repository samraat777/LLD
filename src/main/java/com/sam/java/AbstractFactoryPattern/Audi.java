package com.sam.java.AbstractFactoryPattern;

public class Audi implements Vehicle{



    @Override
    public boolean isLuxury() {
        return true;
    }

    @Override
    public void average() {
        System.out.println("Audi - Luxury");
    }

}
