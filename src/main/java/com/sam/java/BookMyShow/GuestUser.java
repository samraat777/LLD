package com.sam.java.BookMyShow;

public class GuestUser extends User{
    private boolean isRegistered = false;
    public GuestUser( String name) {
        super( name);
    }

    public void register(String name,String email, String password){
        isRegistered = true;
    }
}
