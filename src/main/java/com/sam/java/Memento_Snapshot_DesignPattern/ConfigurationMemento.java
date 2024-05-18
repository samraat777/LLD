package com.sam.java.Memento_Snapshot_DesignPattern;

public class ConfigurationMemento {
    int width;
    int height;

    public ConfigurationMemento(int height, int width) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
