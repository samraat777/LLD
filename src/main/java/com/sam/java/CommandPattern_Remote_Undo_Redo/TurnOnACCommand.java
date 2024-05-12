package com.sam.java.CommandPattern_Remote_Undo_Redo;

public class TurnOnACCommand implements ICommand{
    AirConditioner ac;

    public TurnOnACCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnAc();
    }

    @Override
    public void undo() {
        ac.turnOffAc();
    }
}
