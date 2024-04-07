package com.sam.java.VendingMachineStatePattern;

import java.util.List;
import java.util.Scanner;

public class SelectionState implements VendingMachineState{

    VendingMachineState vendingMachineState;

    ProductHandler productHandler;
    public SelectionState( ProductHandler productHandler) {
        this.productHandler = productHandler;
    }


    @Override
    public String showOptions() throws Exception {
       throw new Exception("Some Internal Error invoked");
    }

    @Override
    public Product selection() throws Exception{
        String options = " enabling selection option \n 1.Enter Product id" ;
        System.out.println(options);
        Scanner sc = new Scanner(System.in);
        int productId = sc.nextInt();
        try{
            Product product = productHandler.getProductById(productId);
            //TODO Call next Payment State
            vendingMachineState = new PaymentState(productHandler);
            vendingMachineState.payment(product);
            return product;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        //System.out.println("Please enter correct productID");
        //throw new Exception("Please enter correct productID");
        return null;
    }

    @Override
    public int payment( Product product) throws Exception {
        return 0;
    }


    @Override
    public void dispenseProduct(Product p,int returnAmount) throws Exception{
        throw new Exception("Some Internal Error invoked");
    }

    @Override
    public int returnMoney(int returnMoney) throws Exception{
        throw new Exception("Some Internal Error invoked");
    }
}
