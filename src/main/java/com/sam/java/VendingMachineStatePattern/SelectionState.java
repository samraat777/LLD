package com.sam.java.VendingMachineStatePattern;

import java.util.Scanner;

public class SelectionState implements VendingMachineState{

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
            if(!product.isAvailable())
            {
                System.out.println("Product out of Stock please look for other item");
                return null;
                //throw new Exception("Product out of stock please refill");
            }
            return product;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int payment(Product product, int amount) throws Exception {
        return 0;
    }


    @Override
    public void dispenseProduct(Product p) throws Exception{
        throw new Exception("Some Internal Error invoked");
    }

    @Override
    public int returnMoney(int returnMoney) throws Exception{
        throw new Exception("Some Internal Error invoked");
    }
}
