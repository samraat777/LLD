package com.sam.java.VendingMachineStatePattern;

public class ExchangeMoneyState implements VendingMachineState{
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
    public void dispenseProduct(Product p,int returnAmount) throws Exception {
        //return null;
    }

    @Override
    public int returnMoney(int returnMoney) throws Exception {
        System.out.println("Please collect your return AMOUNT " + returnMoney);
        return returnMoney;
    }
}
