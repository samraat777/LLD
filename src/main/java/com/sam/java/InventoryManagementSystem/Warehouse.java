package com.sam.java.InventoryManagementSystem;

public class Warehouse {
    Address address;
    Inventory inventory;

    public Warehouse(Address address, Inventory inventory) {
        this.address = address;
        this.inventory = inventory;
    }

    public void addItemToInventory(ProductCategory productCategory)
    {
        this.inventory.productCategoryList.add(productCategory);
    }

    public void removeItemFromInventory(ProductCategory productCategory){
        this.inventory.productCategoryList.remove(productCategory);
    }
}
