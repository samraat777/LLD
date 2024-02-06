package com.sam.java.DecoratorPattern;

public class MushroomTopling extends BasePizza{

    BasePizza basePizza;

    public MushroomTopling(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+15 ;
    }
}
