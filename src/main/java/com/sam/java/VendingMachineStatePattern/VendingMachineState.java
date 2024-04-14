package com.sam.java.VendingMachineStatePattern;

public interface VendingMachineState {


    public String showOptions() throws Exception;
    public Product selection() throws Exception;
    public int payment(Product product, int amount) throws Exception;
    public void dispenseProduct(Product product) throws Exception;

   // void dispenseProduct() throws Exception;

    public int returnMoney(int returnMoney) throws Exception;
}
