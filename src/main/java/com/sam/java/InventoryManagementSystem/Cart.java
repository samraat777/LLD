package com.sam.java.InventoryManagementSystem;

import java.util.Map;

public class Cart {
    //PRODUCT and count mapping
    Map<Product,Integer> insideCard;
   ProductCategory pc;


    public void addItem(Product product,int count)
    {
        int cnt = insideCard.getOrDefault(product,0);
        insideCard.put(product,cnt+count);
        //Removing from Inventory
        pc.removeProduct(product,count);

    }

    public void removeItem(Product product,int count)
    {
        if(insideCard.get(product) >= count)
            insideCard.put(product,insideCard.get(product) - count);
        pc.addProduct(product,count);
    }

    public void viewItem()
    {
        for(Product p : insideCard.keySet())
        {
            System.out.println("Added product : "+ p.name +" quantity -"+ insideCard.get(p));
        }
    }
}
