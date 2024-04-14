package com.sam.java.Calculator_CompositeDesignPattern;

import org.w3c.dom.ls.LSOutput;

public class CalculatorMain {
    // 2 * (1+7)
    public static void main(String[] args) {
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression one = new Number(1);
        ArithmeticExpression seven = new Number(7);

        ArithmeticExpression addExpression = new Expression(one,seven,Operation.ADD);
        ArithmeticExpression parentExpresion = new Expression(two,addExpression,Operation.MULTIPLY);

        System.out.println("Result of Operation " + parentExpresion.toString() + " is " + parentExpresion.evaluate());
    }



}
