package com.sam.java.InventoryManagementSystem;

import java.util.List;

public class WareHouseController {
    List<Warehouse> warehouseList;
    WareHouseSelectionStrategy wareHouseSelectionStrategy;

    public WareHouseController(List<Warehouse> warehouseList, WareHouseSelectionStrategy wareHouseSelectionStrategy) {
        this.warehouseList = warehouseList;
        this.wareHouseSelectionStrategy = wareHouseSelectionStrategy;
    }

    public WareHouseController(List<Warehouse> warehouseList) {
        this.warehouseList = warehouseList;
    }

    public void addWareHouse(Warehouse warehouse)
    {
        warehouseList.add(warehouse);
    }
    public void removeWareHouse(Warehouse warehouse)
    {
        warehouseList.remove(warehouse);
    }

    public void selectWareHouse()
    {
        wareHouseSelectionStrategy.selectWarehouse();
    }
}
