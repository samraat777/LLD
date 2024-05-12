package com.sam.java.CommandPattern_Remote_Undo_Redo;

public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();

        MyRemoteControl remoteObj = new MyRemoteControl();

        remoteObj.setCommand(new TurnOnACCommand(ac));

        //Client Actions only
        remoteObj.pressButton();
    }
}
