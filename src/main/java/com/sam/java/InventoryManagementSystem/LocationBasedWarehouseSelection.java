package com.sam.java.InventoryManagementSystem;

public class LocationBasedWarehouseSelection implements WareHouseSelectionStrategy{
    @Override
    public void selectWarehouse() {
        System.out.println("Location based selection");
    }
}
