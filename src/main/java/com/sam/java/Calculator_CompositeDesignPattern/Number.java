package com.sam.java.Calculator_CompositeDesignPattern;

public class Number implements ArithmeticExpression{
    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int evaluate() {
        System.out.println("Number Value is "+number);
        return number;
    }

    @Override
    public String getExpression() {
        return number+"";
    }
}
