package com.sam.java.BookMyShow;

import java.util.ArrayList;

public class RegisteredUser extends User{
    private boolean isLoggedIn = false;
    private ArrayList<Ticket> bookingHistory;

    public RegisteredUser( String name) {
        super(name);
        this.bookingHistory = new ArrayList<>();
    }

    public void login(String name,String password)
    {
        //checks
        isLoggedIn = true;
    }

}
