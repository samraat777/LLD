package com.sam.java.InventoryManagementSystem;

import java.util.List;

public class Inventory {
    List<ProductCategory> productCategoryList;

    public void addProductCategory(ProductCategory pc)
    {
        productCategoryList.add(pc);
    }

    public Inventory(List<ProductCategory> productCategoryList) {
        this.productCategoryList = productCategoryList;
    }
}
