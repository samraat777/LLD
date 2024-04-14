package com.sam.java.VendingMachineStatePattern;

public class DispenseProductState implements VendingMachineState{

    VendingMachineState vendingMachineState ;

    ProductHandler productHandler;
    public DispenseProductState(ProductHandler productHandler) {
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
    public int payment(Product product, int amount) throws Exception {
        return 0;
    }


    @Override
    public void dispenseProduct(Product product) throws Exception {
        System.out.println("Please recieve your product -- "+ product.getName());
        // reduce the count of inventory
        productHandler.reduceCount(product);
    }



    @Override
    public int returnMoney(int returnMoney) throws Exception {
        return 0;
    }
}
