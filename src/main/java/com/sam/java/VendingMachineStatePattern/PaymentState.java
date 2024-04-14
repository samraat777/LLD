package com.sam.java.VendingMachineStatePattern;

import java.util.Scanner;

public class PaymentState implements VendingMachineState{


    ProductHandler productHandler;
    public PaymentState(ProductHandler productHandler) {
        this.productHandler = productHandler;
    }

    @Override
    public String showOptions() throws Exception {
        return null;
    }

    @Override
    public Product selection() throws Exception {
        return null;
    }

    @Override
    public int payment( Product product,int amount) throws Exception {
        if(amount>=product.getPrice())
        {
            System.out.println("Payment Accepted");
            int returnAmount = amount - product.getPrice();
            return returnAmount;
        }
        else
        {
            System.out.println("Please enter sufficient money, Try again \nTake the change == " + amount);
            return -1;
        }
    }


    @Override
    public void dispenseProduct(Product p) throws Exception {
    }

    @Override
    public int returnMoney(int returnMoney) throws Exception {
        return 0;
    }
}
