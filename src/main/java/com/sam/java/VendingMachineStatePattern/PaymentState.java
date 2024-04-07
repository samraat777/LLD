package com.sam.java.VendingMachineStatePattern;

import java.util.Scanner;

public class PaymentState implements VendingMachineState{

    VendingMachineState vendingMachineState;
    ProductHandler productHandler;
//
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
    public int payment( Product product) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Coins to Buy " + product.getName());
        int amount = sc.nextInt();
        if(amount>=product.getPrice())
        {
            System.out.println("Payment Accepted");
            int returnAmount = amount - product.getPrice();
            //TODO Move to next  DISPENSE state with product and return amount
            vendingMachineState = new DispenseProductState(productHandler);
            vendingMachineState.dispenseProduct(product,returnAmount)  ;
            return 1;
        }
        else
        {
            System.out.println("Please enter sufficient money, Try again");
            //throw new Exception("Please enter sufficient money, Try again");
        }
        return 0;
    }


    @Override
    public void dispenseProduct(Product p,int returnAmount) throws Exception {
        //return null;
    }

    @Override
    public int returnMoney(int returnMoney) throws Exception {
        return 0;
    }
}
