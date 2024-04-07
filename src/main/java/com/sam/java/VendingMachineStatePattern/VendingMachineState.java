package com.sam.java.VendingMachineStatePattern;

public interface VendingMachineState {


    public String showOptions() throws Exception;
    public Product selection() throws Exception;
    public int payment( Product product) throws Exception;
    public void dispenseProduct(Product product,int returnAmount) throws Exception;

   // void dispenseProduct() throws Exception;

    public int returnMoney(int returnMoney) throws Exception;
}
