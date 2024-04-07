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
    public int payment( Product product) throws Exception {
        return 0;
    }


    @Override
    public void dispenseProduct(Product product,int returnAmount) throws Exception {
        System.out.println("Please recieve your product -- "+ product.getName());
        // reduce the count of inventory
        productHandler.reduceCount(product);
        //TODO Call next state with return amount
        vendingMachineState = new ExchangeMoneyState();
        vendingMachineState.returnMoney(returnAmount);
    }



    @Override
    public int returnMoney(int returnMoney) throws Exception {
        return 0;
    }
}
