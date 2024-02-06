package com.sam.java.DecoratorPattern;

public class OrderPizza {
    public static void main(String[] args) {
        //Pizza1 -> FarmHouse + Extrachese + Mushroom
        BasePizza pizza1 = new ExtraCheeseTopling(new MushroomTopling(new FarmhousePizza()));
        System.out.println("pizza 1 cost: "+ pizza1.cost());

        //Pizza2 -> VegDelight  + Mushroom + ExtraCheese + ExtraChese
        BasePizza pizza2 =  new ExtraCheeseTopling(new ExtraCheeseTopling(new MushroomTopling(new VegDelightPizza())));
        System.out.println("pizza 2 cost: "+ pizza2.cost());
    }
}
