package com.sam.java.WeightMachine_AdapterPattern.Adapter;

import com.sam.java.WeightMachine_AdapterPattern.WeightMachine;

public class WeighMachineAdapterImpl implements WeightMachineAdapter{

    WeightMachine weightMachine;

    public WeighMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound = weightMachine.getWeightInPound();

        return weightInPound * .45;
    }
}
