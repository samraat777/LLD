package com.sam.java.FactoryPattern;



public class ShapeFactory {
    Shape getShape(String input)
    {
        //Business Logic
        switch (input)
        {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
