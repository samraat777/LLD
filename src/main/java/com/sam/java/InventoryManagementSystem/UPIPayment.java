package com.sam.java.InventoryManagementSystem;

public class UPIPayment extends Payment{

    public UPIPayment(Order order, Invoice invoice) {
        super(order,invoice);
    }

    @Override
    public boolean payment() {
        double price = invoice.totalPrice;
        System.out.println("Making payement for \n");
        order.showOrderItems();
        System.out.println("Total Price -- "+ price);
        System.out.println("Payement Done By UPI Method");
        return false;
    }
}
