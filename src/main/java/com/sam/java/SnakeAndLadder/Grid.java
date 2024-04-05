package com.sam.java.SnakeAndLadder;

import java.util.ArrayList;
import java.util.List;

public class Grid {
    int n,m;
    List<Cell> cells;

    public Grid() {
    }

    public Grid(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public List<Cell> createCells(int n,int m)
    {
        cells = new ArrayList<>(m*n);
        for(int i =  0 ; i < m*n ; i++)
        {
            Cell cell = new Cell(i);
            cell.setWizard(new Wizard(-1,-1));
            cell.setHasWizard(false);
            cells.add(cell);
        }
        return cells;
    }

    public List<Cell> getCells() {
        return cells;
    }
}
