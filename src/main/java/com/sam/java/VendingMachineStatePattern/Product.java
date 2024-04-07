package com.sam.java.VendingMachineStatePattern;

public class Product {

    String name;
    int productId;
    int price;
    private boolean isAvailable;

    public Product(String name, int productId, int price, boolean isAvailable) {
        this.name = name;
        this.productId = productId;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
