package com.sam.java.InventoryManagementSystem;

import java.util.Map;

public class Payment {

    Order order;
    Invoice invoice;

    public Payment() {
    }

    public Payment(Order order, Invoice invoice) {
        this.order = order;
        this.invoice = invoice;
    }


    public boolean payment(){
        double price = invoice.totalPrice;
        System.out.println("Making payement for \n");
        order.showOrderItems();
        System.out.println("Total Price -- "+ price);
        System.out.println("Payement Done By Cash");
        return false;
    }
}
