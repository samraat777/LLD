package com.sam.java.BookMyShow;

public abstract class User {

    private static int idCounter = 0;
    private int id;
    private String name;

    public User( String name) {
        idCounter++;
        this.id = idCounter;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
