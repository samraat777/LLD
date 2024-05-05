package com.sam.java.InventoryManagementSystem;

import java.util.Map;

public class Invoice {
    Order order;
    int taxes;
    double totalPrice;

    public Invoice() {
    }

    public Invoice(Order order, int taxes) {
        this.order = order;
        this.taxes = taxes;
        this.totalPrice =  returnPrice(order);
    }

    public double returnPrice(Order order)
    {
        Map<Product,Integer> productsAdded = order.productsAdded;
        double price = 0;
        for(Product p : productsAdded.keySet())
        {
            int count = productsAdded.get(p);
            price += p.price * count;
        }
        return price+taxes;
    }
}
