package com.practice.lld.DesignPattern.Structural.Decorator.Decorators;

import com.practice.lld.DesignPattern.Structural.Decorator.BasePizza;

public class PepperoniTopping extends ToppingDecorator {
    public PepperoniTopping(BasePizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Pepperoni Topping";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 50;
    }
}
