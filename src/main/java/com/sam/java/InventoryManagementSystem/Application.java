package com.sam.java.InventoryManagementSystem;

import java.util.*;

public class Application {
    static UserController uc = new UserController();
    //static WareHouseController wc;
    //static OrderController oc;

//    public Application(UserController uc, WareHouseController wc, OrderController oc) {
//        this.uc = uc;
//        this.wc = wc;
//        this.oc = oc;
//    }

    public static void main(String[] args) {
        User user1 = new User(1,"User1",new Address(800010,"Bihar","Patna","Kurji"));
       // uc = new UserController();
        uc.addUser(user1);


        Product product1 = new Product(777,"COLA",10);
        Map<Product,Integer> productList1 = new HashMap<>();
        productList1.put(product1,15);
        ProductCategory productCategory1 = new ProductCategory(1,"Drinks",productList1);


        Product product2 = new Product(111,"Lays",12);
        Map<Product,Integer> productList2 = new HashMap<>();
        productList2.put(product2,10);
        ProductCategory productCategory2 = new ProductCategory(2,"Chips",productList2);

        List<ProductCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(productCategory1);
        productCategoryList.add(productCategory2);

        Inventory inventory = new Inventory(productCategoryList);

        Address address1 = new Address(800010,"Bihar","Patna","Kurji");

        Warehouse warehouse1 = new Warehouse(address1,inventory);
        List<Warehouse> warehouses = new ArrayList<>();
        warehouses.add(warehouse1);


        WareHouseController wc = new WareHouseController(warehouses,new CheapestWarehouseSelection());

        Map<Product,Integer> productsAdded = new HashMap<>();
        productsAdded.put(product1,2);
        productsAdded.put(product2,2);
        Invoice invoice1 = new Invoice();
        Payment payment =new Payment();
        Order order1 = new Order(123,user1,address1,productsAdded,warehouse1,payment,OrderStatus.ORDER_IN_PROGRESS);
        Set<Order> orderSet = new HashSet<>();
        invoice1 = new Invoice(order1,10);
        order1.setInvoice(invoice1);
        Payment payment1 = new UPIPayment(order1,invoice1);

        OrderController oc = new OrderController(orderSet,invoice1,payment1);
        oc.makePayment();


    }


}
