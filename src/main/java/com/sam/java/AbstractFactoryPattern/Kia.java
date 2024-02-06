package com.sam.java.AbstractFactoryPattern;

public class Kia implements Vehicle{


    @Override
    public boolean isLuxury() {
        return false;
    }

    @Override
    public void average() {
        System.out.println("Kia -- Normal Vehicle");
    }

}
