package com.sam.java.CommandPattern_Remote_Undo_Redo;

public class AirConditioner {
    boolean isOn;
    int temprature;

    public void turnOnAc(){
        isOn = true;
        System.out.println("Ac is on");
    }

    public void turnOffAc(){
        System.out.println("Ac is off");
    }

    public void setTemprature(int temprature){
        this.temprature = temprature;
        System.out.println("Temprature set to " + temprature);
    }
}
