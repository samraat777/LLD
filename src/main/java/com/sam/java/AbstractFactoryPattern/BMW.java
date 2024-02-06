package com.sam.java.AbstractFactoryPattern;

public class BMW implements Vehicle{


    @Override
    public boolean isLuxury() {
        return true;
    }

    @Override
    public void average() {
        System.out.println("BMW - LUXURY");
    }


}
