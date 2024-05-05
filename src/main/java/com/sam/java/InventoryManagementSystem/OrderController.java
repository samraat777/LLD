package com.sam.java.InventoryManagementSystem;

import java.util.List;
import java.util.Set;

public class OrderController {
    Set<Order> oc;
    Invoice invoice;
    Payment payment;



    public OrderController(Set<Order> oc, Invoice invoice, Payment payment) {
        this.oc = oc;
        this.invoice = invoice;
        this.payment = payment;
    }

    public void addOrder(Order order){
        System.out.println("Order added \n ");
        order.showOrderItems();
        oc.add(order);
    }
    public void cancelOrder(Order order)
    {

        System.out.println("Order Cancelled \n");
        order.showOrderItems();
        order.orderStatus = OrderStatus.CANCELLED;
        oc.remove(order);
    }

    public void modifyOrder(Order order)
    {
        System.out.println("Order Modified \n");
        oc.add(order);
        order.showOrderItems();
    }


    public void makePayment()
    {
        payment.payment();
    }
}
