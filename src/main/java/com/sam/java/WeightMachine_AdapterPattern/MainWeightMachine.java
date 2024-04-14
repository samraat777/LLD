package com.sam.java.WeightMachine_AdapterPattern;

import com.sam.java.WeightMachine_AdapterPattern.Adapter.WeighMachineAdapterImpl;
import com.sam.java.WeightMachine_AdapterPattern.Adapter.WeightMachineAdapter;

public class MainWeightMachine {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeighMachineAdapterImpl(new WeightMachineForFood());
        System.out.println(weightMachineAdapter.getWeightInKg());

    }
}
