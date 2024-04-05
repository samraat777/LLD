package com.sam.java.SnakeAndLadder;

public class Cell {
    //The Cell number can be used to find the current position of cell
    int index;
    Wizard wizard;

    Boolean hasWizard = false;

    public void setIndex(int index) {
        this.index = index;
    }

    public Wizard getWizard() {
        return wizard;
    }

    public void setWizard(Wizard wizard) {
        this.wizard = wizard;
        this.hasWizard = true;
    }

    public void setWizard(int start,int end) {
        hasWizard = true;
        wizard = new Wizard(start,end);
    }

    public Cell(int index) {
        this.index = index;
    }

    public void setHasWizard(Boolean hasWizard) {
        this.hasWizard = hasWizard;
    }
}
