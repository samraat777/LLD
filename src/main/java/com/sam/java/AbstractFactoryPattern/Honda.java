package com.sam.java.AbstractFactoryPattern;

public class Honda implements Vehicle{


    @Override
    public boolean isLuxury() {
        return false;
    }

    @Override
    public void average() {
        System.out.println("Honda - Average");
    }


}
