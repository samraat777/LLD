package com.sam.java.DecoratorPattern;

public class ExtraCheeseTopling extends TopplingDecorator{

    BasePizza basePizza;
    public ExtraCheeseTopling(BasePizza pizza)
    {
        this.basePizza = pizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}
