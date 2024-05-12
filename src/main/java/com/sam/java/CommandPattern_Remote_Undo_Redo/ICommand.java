package com.sam.java.CommandPattern_Remote_Undo_Redo;

public interface ICommand {
    public void execute();
    public void undo();
}
