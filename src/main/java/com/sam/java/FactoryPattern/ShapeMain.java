package com.sam.java.FactoryPattern;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeObj1 = shapeFactory.getShape("CIRCLE");
        shapeObj1.draw();

        ShapeFactory shapeFactory2 = new ShapeFactory();
        Shape shapeObj2 = shapeFactory.getShape("RECTANGLE");
        shapeObj2.draw();

    }
}
