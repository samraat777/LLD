package com.sam.java.VendingMachineStatePattern;

public class IdleState implements VendingMachineState{

    VendingMachineState vendingMachineState;
    ProductHandler productHandler;

    public IdleState(ProductHandler productHandler) {
        this.productHandler = productHandler;
    }

    @Override
    public String showOptions() throws Exception {
        productHandler.showProducts();
        String welcome = "\n \nWelcome to our machine Please enter product id you want to buy. \n ";
        //TODO Move to select state
        vendingMachineState = new SelectionState(productHandler);
        vendingMachineState.selection();
       return null;
    }

    @Override
    public Product selection() throws Exception {
        return null;
    }

    @Override
    public int payment( Product product) throws Exception {
        return 0;
    }



    @Override
    public void dispenseProduct(Product p,int returnAmount) throws Exception {
       // return null;
    }

    @Override
    public int returnMoney(int returnMoney) throws Exception {
        return 0;
    }
}
