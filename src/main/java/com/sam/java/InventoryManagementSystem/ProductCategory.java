package com.sam.java.InventoryManagementSystem;

import java.util.List;
import java.util.Map;

public class ProductCategory {
    int categoryId;
    String categoryName;
    Map<Product,Integer> productList;


    public ProductCategory(int categoryId, String categoryName, Map<Product, Integer> productList) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.productList = productList;
    }

    public void addProduct(Product product,int count)
    {
        int productCnt = productList.getOrDefault(product,0);
        productList.put(product,productCnt+count);
    }

    public void removeProduct(Product product, int count)
    {
        int productCnt = productList.getOrDefault(product,0);
        if(productCnt>=count)
            productList.put(product,productCnt-count);
        else
        {
            System.out.println("INVENTORY HAS NOT SUFFICIENT PRODUCT");
        }
    }
}
