package com.sam.java.InventoryManagementSystem;

public class Address {
    int pinCode;
    String state;
    String district;
    String locality;

    public Address(int pinCode, String state, String district, String locality) {
        this.pinCode = pinCode;
        this.state = state;
        this.district = district;
        this.locality = locality;
    }
}
