package com.sam.java.VendingMachineStatePattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    static List<Product> productList;

    static ProductHandler productHandler;

    public static void main(String[] args) throws Exception {
        productList = new ArrayList<>();
        Product product1 = new Product("Coke",1,10,true);
        Product product2 = new Product("Soda",2,20,true);
        Product product3 = new Product("Sting",3,10,true);
        Product product4 = new Product("Chips",4,25,true);
        Product product5 = new Product("Limca",5,10,true);
        Product product6 = new Product("Dairy Milk",6,25,true);
        Product product7 = new Product("Water",7,5,true);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);

        productHandler = new ProductHandler(productList);
        System.out.println("Welcome!!");
        int cont = 1;
        Scanner sc = new Scanner(System.in);
        while(cont != 2)
        {


            System.out.println("\n \n1 --- To continue Buying press 1 \n2 --- To stop press 2\n");
            cont = sc.nextInt();
            if(cont != 1)
                break;

            VendingMachineState vendingMachineState = new IdleState(productHandler);
            vendingMachineState.showOptions();


            vendingMachineState = new SelectionState(productHandler);
            Product product = vendingMachineState.selection();
            if(product == null)
                continue;


            System.out.println("Please Enter the Coins to Buy " + product.getName());
            int amount = sc.nextInt();


            vendingMachineState = new PaymentState(productHandler);
            int returnAmount = vendingMachineState.payment(product,amount);

            if(returnAmount < 0)
            {
                continue;
            }


            vendingMachineState = new DispenseProductState(productHandler);
            vendingMachineState.dispenseProduct(product)  ;


            vendingMachineState = new ExchangeMoneyState();
            vendingMachineState.returnMoney(returnAmount);
        }
    }

}
