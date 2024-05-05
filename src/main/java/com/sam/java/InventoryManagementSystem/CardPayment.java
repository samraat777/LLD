package com.sam.java.InventoryManagementSystem;

public class CardPayment extends Payment{
    public CardPayment(Order order, Invoice invoice) {
        super(order, invoice);
    }
    @Override
    public boolean payment() {
        double price = invoice.totalPrice;
        System.out.println("Making payement for \n");
        order.showOrderItems();
        System.out.println("Total Price -- "+ price);
        System.out.println("Payement Done By Card");
        return false;
    }
}
