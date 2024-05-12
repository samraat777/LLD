package com.sam.java.CommandPattern_Remote_Undo_Redo;

import java.util.Stack;

public class MyRemoteControl {

    Stack<ICommand> acCommandHistory = new Stack<>();
    ICommand command;

    public MyRemoteControl() {
    }

    public void setCommand(ICommand command) {
        this.command = command;
        acCommandHistory.add(command);
    }

    public void pressButton(){
        command.execute();
    }

    public void undo(){
        if(!acCommandHistory.isEmpty())
        {
            ICommand lastcommand = acCommandHistory.pop();
            lastcommand.undo();
        }
    }
}
