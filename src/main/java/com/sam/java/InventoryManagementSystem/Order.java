package com.sam.java.InventoryManagementSystem;

import java.util.Map;

public class Order {
    int orderId;
    User user;
    Address address;
    Map<Product,Integer> productsAdded;
    Warehouse wc;
    Invoice vc;
    Payment payment;
    OrderStatus orderStatus;

    public Order(int orderId, User user, Address address, Map<Product, Integer> productsAdded, Warehouse wc, Payment payment, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.user = user;
        this.address = address;
        this.productsAdded = productsAdded;
        this.wc = wc;
        this.payment = payment;
        this.orderStatus = orderStatus;
    }

    public void showOrderItems()
    {
        for(Product p : productsAdded.keySet())
        {
            System.out.println("Added product : "+ p.name +" quantity -"+ productsAdded.get(p));
        }
    }

    public void setInvoice(Invoice vc) {
        this.vc = vc;
    }
}
