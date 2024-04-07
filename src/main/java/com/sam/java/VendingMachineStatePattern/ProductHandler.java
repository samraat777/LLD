package com.sam.java.VendingMachineStatePattern;

import java.security.spec.ECField;
import java.util.List;

public class ProductHandler {
    List<Product> productList;

    public ProductHandler(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Product getProductById(int productId) throws Exception {
        for(Product product : productList )
        {
            if(productId == product.getProductId()) {

                //Call PaymentState and send Product
                return product;
            }

        }
        throw new Exception("Product not valid");
    }

    public boolean reduceCount(Product product)
    {
        boolean success = false;
        for(Product p : productList )
        {
            if(product == p) {

                product.setAvailable(false);
                success=true;
            }

        }
        return success;
    }

    public void showProducts()
    {
        System.out.println("Product available are : ");
        System.out.println("ProductID       ProductName        ProductPrice ");
        System.out.println();
        for(Product p :productList)
        {
            System.out.println(p.getProductId() + "                 " + p.getName() + "                  " + p.getPrice());
        }
    }


}
