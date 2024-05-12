package com.sam.java.CommandPattern_Remote_Undo_Redo;

public class TurnOffACCommand implements ICommand{
    AirConditioner ac;

    public TurnOffACCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOffAc();
    }

    @Override
    public void undo() {
        ac.turnOnAc();
    }
}
